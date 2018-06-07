package org.study.patterns.creational.prototype;

import org.study.entities.website.WebSite;

public class WebSiteFactory {
    private WebSite webSite;

    public WebSiteFactory(WebSite webSite) {
        this.webSite = webSite;
    }

    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }

    public WebSite copyWebSite() {
        return (WebSite) webSite.copy();
    }
}
