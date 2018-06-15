package org.study.entities.countable;

import java.math.BigDecimal;

public class Power implements Countable {
    private BigDecimal ammount;

    @Override
    public BigDecimal getCount() {
        return ammount;
    }
}
