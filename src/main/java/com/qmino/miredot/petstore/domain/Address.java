package com.qmino.miredot.petstore.domain;

public class Address {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Address() {
    }

    public Address(String street1, String city, String zipcode, String country) {
        this.street1 = street1;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    /**
     * @return The first street line.
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * @param street1 First street line.
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * @return Second street line.
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * @param street2 Second street line.
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * @return Full name of the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city Full name of the city.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return Full state name.
     */
    public String getState() {
        return state;
    }

    /**
     * @param state Full state name (if applicable).
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The zip code
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode The zip code
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return Full country name.
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country Full country name.  e.g., Belgium
     */
    public void setCountry(String country) {
        this.country = country;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (!city.equals(address.city)) return false;
        if (!country.equals(address.country)) return false;
        if (state != null ? !state.equals(address.state) : address.state != null) return false;
        if (!street1.equals(address.street1)) return false;
        if (street2 != null ? !street2.equals(address.street2) : address.street2 != null) return false;
        if (!zipcode.equals(address.zipcode)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = street1.hashCode();
        result = 31 * result + (street2 != null ? street2.hashCode() : 0);
        result = 31 * result + city.hashCode();
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + zipcode.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Address");
        sb.append("{street1='").append(street1).append('\'');
        sb.append(", street2='").append(street2).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", zipcode='").append(zipcode).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
