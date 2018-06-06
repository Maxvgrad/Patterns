package org.study.patterns.creational.builder;

import org.study.entities.website.WebSite;
import org.study.patterns.Pattern;

public class BuilderPattern implements Pattern {
    @Override
    public void execute() {
        Director director = new Director(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
    }
}
