package org.study.patterns.creational.prototype;

import org.study.entities.website.WebSite;
import org.study.patterns.Pattern;
import org.study.patterns.creational.builder.Director;
import org.study.patterns.creational.builder.EnterpriseWebSiteBuilder;

public class PrototypePattern implements Pattern{
    @Override
    public void execute() {
        Director director = new Director(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
        System.out.println("==============");
        WebSiteFactory webSiteFactory = new WebSiteFactory(webSite);
        System.out.println(webSiteFactory.copyWebSite());

    }
}
