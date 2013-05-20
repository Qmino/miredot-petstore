package com.qmino.miredot.petstore.domain;

public enum CreditCardType {

    // ======================================
    // =             Constants              =
    // ======================================

    VISA("VISA"),
    MASTER_CARD("MASTER,CARD"),
    AMERICAN_EXPRESS("AMERICAN EXPRESS");


    private String name;

    CreditCardType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
