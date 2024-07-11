package com.amazon.ata.types;

import java.math.BigDecimal;

public class PolyBag extends Packaging {
    private BigDecimal mass;
    private double volume;

    /**
     * Instantiates a new Packaging object.
     *
     * @param material - the Material of the package
     */
    public PolyBag(Material material) {
        super(material);
    }

    @Override
    public boolean canFitItem(Item item) {
        return false;
    }

    @Override
    public BigDecimal getMass() {

        return BigDecimal.valueOf(2);
    }

}
