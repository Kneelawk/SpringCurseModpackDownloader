/**
 * Created by Kneelawk on 8/4/19.
 */
open module com.kneelawk.springtest {
    exports com.kneelawk.springtest;

    // java
    requires java.prefs;

    // spring
    requires jackson.annotations;
    requires reactor.core;
    requires reactor.netty;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.webflux;

    // javafx
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.swing;

    // utils
    requires com.google.common;
    requires org.apache.commons.lang3;
    requires slf4j.api;
}