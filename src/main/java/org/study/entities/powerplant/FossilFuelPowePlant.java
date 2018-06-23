package org.study.entities.powerplant;

import org.study.entities.countable.Power;

public class FossilFuelPowePlant extends PowerPlant implements Powerable {

    public FossilFuelPowePlant() {
        super("FossilFuel power plant");
    }

    @Override
    protected void startPlant() {

    }

    @Override
    protected void shutDownPlant() {

    }

    @Override
    protected void maintainPlant() {

    }

    @Override
    public Power producePower() {
        return null;
    }
}
