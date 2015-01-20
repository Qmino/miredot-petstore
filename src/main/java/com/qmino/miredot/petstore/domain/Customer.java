package com.qmino.miredot.petstore.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@XmlRootElement
public class Customer implements Serializable {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String telephone;
    private String email;
    private Address homeAddress = new Address();
    private Date dateOfBirth;
    private Integer age;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Customer() {
    }

    public Customer(String firstname, String lastname, String login, String password, String email, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.email = email;
        this.homeAddress = address;
        this.dateOfBirth = new Date();
    }

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    /**
     * This method calculates the age of the customer
     */
    public void calculateAge() {
        if (dateOfBirth == null) {
            age = null;
            return;
        }

        Calendar birth = new GregorianCalendar();
        birth.setTime(dateOfBirth);
        Calendar now = new GregorianCalendar();
        now.setTime(new Date());
        int adjust = 0;
        if (now.get(Calendar.DAY_OF_YEAR) - birth.get(Calendar.DAY_OF_YEAR) < 0) {
            adjust = -1;
        }
        age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + adjust;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    /**
     * @return The internal id of the customer
     */
    public Long getId() {
        return id;
    }

    /**
     * @return The unique customer id.
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login Unique customer id.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return The password of the customer
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return The first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname The first name.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return The last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname The last name.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return The telephone number.
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone The telephone number, preferably with country code.
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The home address.
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the home address. This is the complete address with the street, number, zip code, city and optionally the
     * country.
     *
     * @param homeAddress The home address.
     */
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return The date of birth.
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth The date of birth.
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return The age, calculated from the date of birth.
     */
    public Integer getAge() {
        return age;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!login.equals(customer.login)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Customer");
        sb.append("{id=").append(id);
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
