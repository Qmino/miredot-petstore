package com.qmino.miredot.petstore.domain;

/**
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
public class PromotionalProduct extends Product {
    private float reduction;

    /**
     * @return The reduction as a number between 0 and 1.
     */
    public float getReduction() {
        return reduction;
    }

    /**
     * @param reduction The reduction as a number between 0 and 1.
     */
    public void setReduction(float reduction) {
        this.reduction = reduction;
    }
}
