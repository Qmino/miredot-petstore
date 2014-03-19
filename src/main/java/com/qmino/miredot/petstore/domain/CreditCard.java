package com.qmino.miredot.petstore.domain;

public class CreditCard {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String creditCardNumber;
    private CreditCardType creditCardType;
    private String creditCardExpDate;

    // ======================================
    // =            Constructors            =
    // ======================================

    public CreditCard() {
    }

    public CreditCard(String creditCardNumber, CreditCardType creditCardType, String creditCardExpDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardType = creditCardType;
        this.creditCardExpDate = creditCardExpDate;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber Number without spaces
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    /**
     * @return Expiration date as MM/YY
     */
    public String getCreditCardExpDate() {
        return creditCardExpDate;
    }

    /**
     * @param creditCardExpDate Expiration date as MM/YY
     */
    public void setCreditCardExpDate(String creditCardExpDate) {
        this.creditCardExpDate = creditCardExpDate;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCard)) return false;

        CreditCard that = (CreditCard) o;

        if (!creditCardNumber.equals(that.creditCardNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return creditCardNumber.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CreditCard");
        sb.append("{creditCardNumber='").append(creditCardNumber).append('\'');
        sb.append(", creditCardType=").append(creditCardType);
        sb.append(", creditCardExpDate='").append(creditCardExpDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}