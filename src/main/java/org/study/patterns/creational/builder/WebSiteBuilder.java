package org.study.patterns.creational.builder;

import org.study.entities.website.WebSite;

import java.util.Objects;

public abstract class WebSiteBuilder {
    protected WebSite webSite;

    public void createWebSite() {
        webSite = new WebSite();
    }

    protected abstract void setName();

    protected abstract void setCms();

    protected abstract void setPrice();

    public WebSite getWebSite() {
        return Objects.requireNonNull(webSite, "Web site is not created");
    }
}
