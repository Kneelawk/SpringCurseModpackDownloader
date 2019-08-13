
package com.kneelawk.springtest.json;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "authors",
    "attachments",
    "websiteUrl",
    "gameId",
    "summary",
    "defaultFileId",
    "downloadCount",
    "latestFiles",
    "categories",
    "status",
    "primaryCategoryId",
    "categorySection",
    "slug",
    "gameVersionLatestFiles",
    "isFeatured",
    "popularityScore",
    "gamePopularityRank",
    "primaryLanguage",
    "gameSlug",
    "gameName",
    "portalName",
    "dateModified",
    "dateCreated",
    "dateReleased",
    "isAvailable",
    "isExperiemental"
})
public class AddonJson {

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("authors")
    private List<AuthorJson> authors = Lists.newArrayList();
    @JsonProperty("attachments")
    private List<AttachmentJson> attachments = Lists.newArrayList();
    @JsonProperty("websiteUrl")
    private String websiteUrl;
    @JsonProperty("gameId")
    private long gameId;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("defaultFileId")
    private long defaultFileId;
    @JsonProperty("downloadCount")
    private double downloadCount;
    @JsonProperty("latestFiles")
    private List<AddonFileJson> latestFiles = Lists.newArrayList();
    @JsonProperty("categories")
    private List<CategoryJson> categories = Lists.newArrayList();
    @JsonProperty("status")
    private long status;
    @JsonProperty("primaryCategoryId")
    private long primaryCategoryId;
    @JsonProperty("categorySection")
    private CategorySectionJson categorySection;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("gameVersionLatestFiles")
    private List<GameVersionLatestFileJson> gameVersionLatestFiles = Lists.newArrayList();
    @JsonProperty("isFeatured")
    private boolean isFeatured;
    @JsonProperty("popularityScore")
    private double popularityScore;
    @JsonProperty("gamePopularityRank")
    private long gamePopularityRank;
    @JsonProperty("primaryLanguage")
    private String primaryLanguage;
    @JsonProperty("gameSlug")
    private String gameSlug;
    @JsonProperty("gameName")
    private String gameName;
    @JsonProperty("portalName")
    private String portalName;
    @JsonProperty("dateModified")
    private Date dateModified;
    @JsonProperty("dateCreated")
    private Date dateCreated;
    @JsonProperty("dateReleased")
    private Date dateReleased;
    @JsonProperty("isAvailable")
    private boolean isAvailable;
    @JsonProperty("isExperiemental")
    private boolean isExperiemental;

    public AddonJson() {
    }

    private AddonJson(long id, String name, List<AuthorJson> authors,
                      List<AttachmentJson> attachments, String websiteUrl, long gameId, String summary,
                      long defaultFileId,
                      double downloadCount, List<AddonFileJson> latestFiles,
                      List<CategoryJson> categories, long status, long primaryCategoryId,
                      CategorySectionJson categorySection, String slug,
                      List<GameVersionLatestFileJson> gameVersionLatestFiles, boolean isFeatured,
                      double popularityScore,
                      long gamePopularityRank, String primaryLanguage, String gameSlug, String gameName,
                      String portalName, Date dateModified, Date dateCreated, Date dateReleased, boolean isAvailable,
                      boolean isExperiemental) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.attachments = attachments;
        this.websiteUrl = websiteUrl;
        this.gameId = gameId;
        this.summary = summary;
        this.defaultFileId = defaultFileId;
        this.downloadCount = downloadCount;
        this.latestFiles = latestFiles;
        this.categories = categories;
        this.status = status;
        this.primaryCategoryId = primaryCategoryId;
        this.categorySection = categorySection;
        this.slug = slug;
        this.gameVersionLatestFiles = gameVersionLatestFiles;
        this.isFeatured = isFeatured;
        this.popularityScore = popularityScore;
        this.gamePopularityRank = gamePopularityRank;
        this.primaryLanguage = primaryLanguage;
        this.gameSlug = gameSlug;
        this.gameName = gameName;
        this.portalName = portalName;
        this.dateModified = dateModified;
        this.dateCreated = dateCreated;
        this.dateReleased = dateReleased;
        this.isAvailable = isAvailable;
        this.isExperiemental = isExperiemental;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<AuthorJson> getAuthors() {
        return authors;
    }

    public List<AttachmentJson> getAttachments() {
        return attachments;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public long getGameId() {
        return gameId;
    }

    public String getSummary() {
        return summary;
    }

    public long getDefaultFileId() {
        return defaultFileId;
    }

    public double getDownloadCount() {
        return downloadCount;
    }

    public List<AddonFileJson> getLatestFiles() {
        return latestFiles;
    }

    public List<CategoryJson> getCategories() {
        return categories;
    }

    public long getStatus() {
        return status;
    }

    public long getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public CategorySectionJson getCategorySection() {
        return categorySection;
    }

    public String getSlug() {
        return slug;
    }

    public List<GameVersionLatestFileJson> getGameVersionLatestFiles() {
        return gameVersionLatestFiles;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public double getPopularityScore() {
        return popularityScore;
    }

    public long getGamePopularityRank() {
        return gamePopularityRank;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public String getGameSlug() {
        return gameSlug;
    }

    public String getGameName() {
        return gameName;
    }

    public String getPortalName() {
        return portalName;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateReleased() {
        return dateReleased;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isExperiemental() {
        return isExperiemental;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("authors", authors)
                .append("attachments", attachments)
                .append("websiteUrl", websiteUrl)
                .append("gameId", gameId)
                .append("summary", summary)
                .append("defaultFileId", defaultFileId)
                .append("downloadCount", downloadCount)
                .append("latestFiles", latestFiles)
                .append("categories", categories)
                .append("status", status)
                .append("primaryCategoryId", primaryCategoryId)
                .append("categorySection", categorySection)
                .append("slug", slug)
                .append("gameVersionLatestFiles", gameVersionLatestFiles)
                .append("isFeatured", isFeatured)
                .append("popularityScore", popularityScore)
                .append("gamePopularityRank", gamePopularityRank)
                .append("primaryLanguage", primaryLanguage)
                .append("gameSlug", gameSlug)
                .append("gameName", gameName)
                .append("portalName", portalName)
                .append("dateModified", dateModified)
                .append("dateCreated", dateCreated)
                .append("dateReleased", dateReleased)
                .append("isAvailable", isAvailable)
                .append("isExperiemental", isExperiemental)
                .toString();
    }

    public static class Builder {
        private long id;
        private String name;
        private final List<AuthorJson> authors =
                Lists.newArrayList();
        private final List<AttachmentJson> attachments =
                Lists.newArrayList();
        private String websiteUrl;
        private long gameId;
        private String summary;
        private long defaultFileId;
        private double downloadCount;
        private final List<AddonFileJson> latestFiles =
                Lists.newArrayList();
        private final List<CategoryJson> categories =
                Lists.newArrayList();
        private long status;
        private long primaryCategoryId;
        private CategorySectionJson categorySection;
        private String slug;
        private final List<GameVersionLatestFileJson> gameVersionLatestFiles =
                Lists.newArrayList();
        private boolean isFeatured;
        private double popularityScore;
        private long gamePopularityRank;
        private String primaryLanguage;
        private String gameSlug;
        private String gameName;
        private String portalName;
        private Date dateModified;
        private Date dateCreated;
        private Date dateReleased;
        private boolean isAvailable;
        private boolean isExperiemental;

        public Builder() {
        }

        public Builder(long id, String name,
                       Collection<AuthorJson> authors,
                       Collection<AttachmentJson> attachments,
                       String websiteUrl, long gameId, String summary, long defaultFileId,
                       double downloadCount,
                       Collection<AddonFileJson> latestFiles,
                       Collection<CategoryJson> categories, long status,
                       long primaryCategoryId, CategorySectionJson categorySection,
                       String slug,
                       Collection<GameVersionLatestFileJson> gameVersionLatestFiles,
                       boolean isFeatured, double popularityScore, long gamePopularityRank,
                       String primaryLanguage, String gameSlug, String gameName,
                       String portalName, Date dateModified, Date dateCreated,
                       Date dateReleased, boolean isAvailable, boolean isExperiemental) {
            this.id = id;
            this.name = name;
            this.authors.addAll(authors);
            this.attachments.addAll(attachments);
            this.websiteUrl = websiteUrl;
            this.gameId = gameId;
            this.summary = summary;
            this.defaultFileId = defaultFileId;
            this.downloadCount = downloadCount;
            this.latestFiles.addAll(latestFiles);
            this.categories.addAll(categories);
            this.status = status;
            this.primaryCategoryId = primaryCategoryId;
            this.categorySection = categorySection;
            this.slug = slug;
            this.gameVersionLatestFiles.addAll(gameVersionLatestFiles);
            this.isFeatured = isFeatured;
            this.popularityScore = popularityScore;
            this.gamePopularityRank = gamePopularityRank;
            this.primaryLanguage = primaryLanguage;
            this.gameSlug = gameSlug;
            this.gameName = gameName;
            this.portalName = portalName;
            this.dateModified = dateModified;
            this.dateCreated = dateCreated;
            this.dateReleased = dateReleased;
            this.isAvailable = isAvailable;
            this.isExperiemental = isExperiemental;
        }

        public AddonJson build() {
            if (name == null)
                throw new IllegalStateException("No name specified");
            if (websiteUrl == null)
                throw new IllegalStateException("No websiteUrl specified");
            if (summary == null)
                throw new IllegalStateException("No summary specified");
            if (categorySection == null)
                throw new IllegalStateException("No categorySection specified");
            if (slug == null)
                throw new IllegalStateException("No slug specified");
            if (primaryLanguage == null)
                throw new IllegalStateException("No primaryLanguage specified");
            if (gameSlug == null)
                throw new IllegalStateException("No gameSlug specified");
            if (gameName == null)
                throw new IllegalStateException("No gameName specified");
            if (portalName == null)
                throw new IllegalStateException("No portalName specified");
            if (dateModified == null)
                throw new IllegalStateException("No dateModified specified");
            if (dateCreated == null)
                throw new IllegalStateException("No dateCreated specified");
            if (dateReleased == null)
                throw new IllegalStateException("No dateReleased specified");
            return new AddonJson(id, name, ImmutableList.copyOf(authors),
                    ImmutableList.copyOf(attachments), websiteUrl, gameId, summary,
                    defaultFileId, downloadCount, ImmutableList.copyOf(latestFiles),
                    ImmutableList.copyOf(categories), status, primaryCategoryId,
                    categorySection, slug, ImmutableList.copyOf(gameVersionLatestFiles),
                    isFeatured, popularityScore, gamePopularityRank, primaryLanguage, gameSlug, gameName, portalName,
                    dateModified, dateCreated, dateReleased, isAvailable, isExperiemental);
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public List<AuthorJson> getAuthors() {
            return authors;
        }

        public Builder setAuthors(Collection<AuthorJson> authors) {
            this.authors.clear();
            this.authors.addAll(authors);
            return this;
        }

        public Builder addAuthor(AuthorJson author) {
            this.authors.add(author);
            return this;
        }

        public Builder addAuthor(AuthorJson... authors) {
            this.authors.addAll(Arrays.asList(authors));
            return this;
        }

        public Builder addAuthors(Collection<AuthorJson> authors) {
            this.authors.addAll(authors);
            return this;
        }

        public List<AttachmentJson> getAttachments() {
            return attachments;
        }

        public Builder setAttachments(Collection<AttachmentJson> attachments) {
            this.attachments.clear();
            this.attachments.addAll(attachments);
            return this;
        }

        public Builder addAttachment(AttachmentJson attachment) {
            this.attachments.add(attachment);
            return this;
        }

        public Builder addAttachment(AttachmentJson... attachments) {
            this.attachments.addAll(Arrays.asList(attachments));
            return this;
        }

        public Builder addAttachments(Collection<AttachmentJson> attachments) {
            this.attachments.addAll(attachments);
            return this;
        }

        public String getWebsiteUrl() {
            return websiteUrl;
        }

        public Builder setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }

        public long getGameId() {
            return gameId;
        }

        public Builder setGameId(long gameId) {
            this.gameId = gameId;
            return this;
        }

        public String getSummary() {
            return summary;
        }

        public Builder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public long getDefaultFileId() {
            return defaultFileId;
        }

        public Builder setDefaultFileId(long defaultFileId) {
            this.defaultFileId = defaultFileId;
            return this;
        }

        public double getDownloadCount() {
            return downloadCount;
        }

        public Builder setDownloadCount(double downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        public List<AddonFileJson> getLatestFiles() {
            return latestFiles;
        }

        public Builder setLatestFiles(Collection<AddonFileJson> latestFiles) {
            this.latestFiles.clear();
            this.latestFiles.addAll(latestFiles);
            return this;
        }

        public Builder addLatestFile(AddonFileJson latestFile) {
            this.latestFiles.add(latestFile);
            return this;
        }

        public Builder addLatestFile(AddonFileJson... latestFiles) {
            this.latestFiles.addAll(Arrays.asList(latestFiles));
            return this;
        }

        public Builder addLatestFiles(Collection<AddonFileJson> latestFiles) {
            this.latestFiles.addAll(latestFiles);
            return this;
        }

        public List<CategoryJson> getCategories() {
            return categories;
        }

        public Builder setCategories(Collection<CategoryJson> categories) {
            this.categories.clear();
            this.categories.addAll(categories);
            return this;
        }

        public Builder addCategorie(CategoryJson categorie) {
            this.categories.add(categorie);
            return this;
        }

        public Builder addCategorie(CategoryJson... categories) {
            this.categories.addAll(Arrays.asList(categories));
            return this;
        }

        public Builder addCategories(Collection<CategoryJson> categories) {
            this.categories.addAll(categories);
            return this;
        }

        public long getStatus() {
            return status;
        }

        public Builder setStatus(long status) {
            this.status = status;
            return this;
        }

        public long getPrimaryCategoryId() {
            return primaryCategoryId;
        }

        public Builder setPrimaryCategoryId(long primaryCategoryId) {
            this.primaryCategoryId = primaryCategoryId;
            return this;
        }

        public CategorySectionJson getCategorySection() {
            return categorySection;
        }

        public Builder setCategorySection(CategorySectionJson categorySection) {
            this.categorySection = categorySection;
            return this;
        }

        public String getSlug() {
            return slug;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public List<GameVersionLatestFileJson> getGameVersionLatestFiles() {
            return gameVersionLatestFiles;
        }

        public Builder setGameVersionLatestFiles(
                Collection<GameVersionLatestFileJson> gameVersionLatestFiles) {
            this.gameVersionLatestFiles.clear();
            this.gameVersionLatestFiles.addAll(gameVersionLatestFiles);
            return this;
        }

        public Builder addGameVersionLatestFile(
                GameVersionLatestFileJson gameVersionLatestFile) {
            this.gameVersionLatestFiles.add(gameVersionLatestFile);
            return this;
        }

        public Builder addGameVersionLatestFile(
                GameVersionLatestFileJson... gameVersionLatestFiles) {
            this.gameVersionLatestFiles.addAll(Arrays.asList(gameVersionLatestFiles));
            return this;
        }

        public Builder addGameVersionLatestFiles(
                Collection<GameVersionLatestFileJson> gameVersionLatestFiles) {
            this.gameVersionLatestFiles.addAll(gameVersionLatestFiles);
            return this;
        }

        public boolean isFeatured() {
            return isFeatured;
        }

        public Builder setFeatured(boolean isFeatured) {
            this.isFeatured = isFeatured;
            return this;
        }

        public double getPopularityScore() {
            return popularityScore;
        }

        public Builder setPopularityScore(double popularityScore) {
            this.popularityScore = popularityScore;
            return this;
        }

        public long getGamePopularityRank() {
            return gamePopularityRank;
        }

        public Builder setGamePopularityRank(long gamePopularityRank) {
            this.gamePopularityRank = gamePopularityRank;
            return this;
        }

        public String getPrimaryLanguage() {
            return primaryLanguage;
        }

        public Builder setPrimaryLanguage(String primaryLanguage) {
            this.primaryLanguage = primaryLanguage;
            return this;
        }

        public String getGameSlug() {
            return gameSlug;
        }

        public Builder setGameSlug(String gameSlug) {
            this.gameSlug = gameSlug;
            return this;
        }

        public String getGameName() {
            return gameName;
        }

        public Builder setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }

        public String getPortalName() {
            return portalName;
        }

        public Builder setPortalName(String portalName) {
            this.portalName = portalName;
            return this;
        }

        public Date getDateModified() {
            return dateModified;
        }

        public Builder setDateModified(Date dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public Builder setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Date getDateReleased() {
            return dateReleased;
        }

        public Builder setDateReleased(Date dateReleased) {
            this.dateReleased = dateReleased;
            return this;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public Builder setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public boolean isExperiemental() {
            return isExperiemental;
        }

        public Builder setExperiemental(boolean isExperiemental) {
            this.isExperiemental = isExperiemental;
            return this;
        }
    }
}
