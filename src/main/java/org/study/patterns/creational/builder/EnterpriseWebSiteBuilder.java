package org.study.patterns.creational.builder;

import org.javamoney.moneta.Money;
import org.study.utils.Cms;

import javax.money.Monetary;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder{
    @Override
    protected void setName() {
        webSite.setName("Enterprise web site");
    }

    @Override
    protected void setCms() {
        webSite.setCms(Cms.BITRIX);
    }

    @Override
    protected void setPrice() {
        webSite.setPrice(Money.of(500, "USD"));
    }
}
