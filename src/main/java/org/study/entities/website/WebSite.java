package org.study.entities.website;

import org.javamoney.moneta.Money;
import org.study.patterns.creational.prototype.Copyable;
import org.study.utils.Cms;

public class WebSite implements Copyable {
    private String name;
    private Cms cms;
    private Money price;

    public WebSite setName(String name) {
        this.name = name;
        return this;
    }

    public WebSite setCms(Cms cms) {
        this.cms = cms;
        return this;
    }

    public WebSite setPrice(Money price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cms getCms() {
        return cms;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public Object copy() {
        return new WebSite().setCms(getCms())
                            .setName(getName())
                            .setPrice(getPrice());
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
