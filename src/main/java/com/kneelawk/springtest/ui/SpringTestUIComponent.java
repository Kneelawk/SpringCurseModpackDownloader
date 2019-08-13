package com.kneelawk.springtest.ui;

import com.kneelawk.springtest.curse.CurseTaskFactory;
import com.kneelawk.springtest.curse.ModDownloadResult;
import com.kneelawk.springtest.net.DownloadClient;
import javafx.application.Platform;
import javafx.beans.property.*;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.util.converter.LongStringConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.prefs.Preferences;

/**
 * Created by Kneelawk on 8/4/19.
 */
@Component
public class SpringTestUIComponent {
    private static final String PREVIOUS_DIRECTORY_KEY = "directory.previous";

    private static Logger log = LoggerFactory.getLogger(SpringTestUIComponent.class);

    private Preferences preferences = Preferences.userNodeForPackage(SpringTestUIComponent.class);
    private DirectoryChooser directoryChooser;
    private File previousDir = new File(preferences.get(PREVIOUS_DIRECTORY_KEY, System.getProperty("user.home")));
    private BooleanProperty running = new SimpleBooleanProperty(false);
    private DoubleProperty progress = new SimpleDoubleProperty(0);
    private StringProperty outputLocation = new SimpleStringProperty();
    private LongProperty projectID = new SimpleLongProperty();
    private LongProperty fileID = new SimpleLongProperty();

    private final CurseTaskFactory curseTaskFactory;
    private final DownloadClient downloadClient;

    public SpringTestUIComponent(CurseTaskFactory curseTaskFactory,
                                 DownloadClient downloadClient) {
        this.curseTaskFactory = curseTaskFactory;
        this.downloadClient = downloadClient;
    }

    @EventListener
    public void init(ContextRefreshedEvent event) throws Exception {
        new JFXPanel();
        Platform.runLater(() -> start(new Stage()));
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mod Downloader");

        directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select an Output Location");

        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(25));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.disableProperty().bind(running);
        root.getChildren().add(grid);

        ColumnConstraints cs1 = new ColumnConstraints(), cs2 = new ColumnConstraints();
        cs1.setHgrow(Priority.NEVER);
        cs2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(cs1, cs2, cs1);

        Label outputLocationLabel = new Label("Output Location:");
        grid.add(outputLocationLabel, 0, 0);

        TextField outputLocationField = new TextField();
        outputLocation.bind(outputLocationField.textProperty());
        grid.add(outputLocationField, 1, 0);

        Button outputLocationSelectButton = new Button("...");
        outputLocationSelectButton.setOnAction(event -> {
            directoryChooser.setInitialDirectory(previousDir);
            File dir = directoryChooser.showDialog(primaryStage);
            if (dir != null) {
                outputLocationField.setText(dir.getAbsolutePath());
                previousDir = dir;
                preferences.put(PREVIOUS_DIRECTORY_KEY, previousDir.getAbsolutePath());
            }
        });
        grid.add(outputLocationSelectButton, 2, 0);

        Label projectIDLabel = new Label("Project ID:");
        grid.add(projectIDLabel, 0, 1);

        TextField projectIDField = new TextField();
        LongStringConverter longStringConverter = new LongStringConverter();
        TextFormatter<Long> projectIDFormat = new TextFormatter<>(longStringConverter);
        projectIDField.setTextFormatter(projectIDFormat);
        projectID.bind(projectIDFormat.valueProperty());
        grid.add(projectIDField, 1, 1);

        Label fileIDLabel = new Label("File ID:");
        grid.add(fileIDLabel, 0, 2);

        TextField fileIDField = new TextField();
        TextFormatter<Long> fileIDFormat = new TextFormatter<>(longStringConverter);
        fileIDField.setTextFormatter(fileIDFormat);
        fileID.bind(fileIDFormat.valueProperty());
        grid.add(fileIDField, 1, 2);

        Button downloadButton = new Button("Download Mod");
        downloadButton.setOnAction(event -> handleModDownload());
        GridPane.setHgrow(downloadButton, Priority.ALWAYS);
        downloadButton.setMaxWidth(Double.MAX_VALUE);
        grid.add(downloadButton, 0, 3, 3, 1);

        ProgressBar downloadProgressBar = new ProgressBar();
        downloadProgressBar.setProgress(0);
        downloadProgressBar.setMaxWidth(Double.MAX_VALUE);
        downloadProgressBar.setMinHeight(20);
        downloadProgressBar.progressProperty().bind(progress);
        root.getChildren().add(downloadProgressBar);

        Scene scene = new Scene(root, 500, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void handleModDownload() {
        Path outputDir = Paths.get(outputLocation.get());
        if (Files.exists(outputDir)) {
            Mono<ModDownloadResult> modDownload = curseTaskFactory.modDownload(projectID.get(), fileID.get(), outputDir,
                    progressEvent -> Platform.runLater(() -> progress.set(progressEvent.getCurrent() == -1 ? -1 :
                            ((double) progressEvent.getCurrent()) / ((double) progressEvent.getMax()))));
            running.set(true);
            modDownload.subscribe(modDownloadResult -> Platform.runLater(() -> {
                running.set(false);
                System.out.println("Downloaded: " + modDownloadResult.getDownloadedFile());
            }), throwable -> Platform.runLater(() -> {
                running.set(false);
                throwable.printStackTrace();
            }));
        } else {
            System.err.println("Output Dir: " + outputDir + " does not exist");
        }
    }
}
