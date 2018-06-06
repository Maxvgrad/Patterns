package org.study.patterns.creational.builder;

import org.study.entities.website.WebSite;

public class Director {
    private WebSiteBuilder webSiteBuilder;

    public Director(WebSiteBuilder webSiteBuilder) {
        this.webSiteBuilder = webSiteBuilder;
    }

    public WebSite buildWebSite() {
        webSiteBuilder.createWebSite();
        webSiteBuilder.setName();
        webSiteBuilder.setCms();
        webSiteBuilder.setPrice();
        return webSiteBuilder.getWebSite();
    }
}
