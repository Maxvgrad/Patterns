package org.study.entities.website;

import org.javamoney.moneta.Money;
import org.study.utils.Cms;

public class WebSite {
    private String name;
    private Cms cms;
    private Money price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
