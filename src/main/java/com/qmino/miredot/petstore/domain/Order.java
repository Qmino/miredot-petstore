package com.qmino.miredot.petstore.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Order {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private Date orderDate;
    private Customer customer;
    private List<OrderLine> orderLines;
    private Address deliveryAddress;
    private CreditCard creditCard = new CreditCard();

    // ======================================
    // =            Constructors            =
    // ======================================

    public Order() {
    }

    public Order(Customer customer, CreditCard creditCard, Address deliveryAddress) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.deliveryAddress = deliveryAddress;
    }

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    private void setDefaultData() {
        orderDate = new Date();
    }

    // ======================================
    // =              Public Methods        =
    // ======================================

    /**
     * @return Total price of this order.
     */
    public Float getTotal() {
        if (orderLines == null || orderLines.isEmpty())
            return 0f;

        Float total = 0f;

        // Sum up the quantities
        for (OrderLine orderLine : orderLines) {
            total += (orderLine.getSubTotal());
        }

        return total;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public Long getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    /**
     * @param orderLines The individual items in this order.
     */
    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    /**
     * @return The delivery address if there is one.
     */
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCardNumber() {
        return creditCard.getCreditCardNumber();
    }

    public void setCreditCardNumber(String creditCardNumber) {
        creditCard.setCreditCardNumber(creditCardNumber);
    }

    public CreditCardType getCreditCardType() {
        return creditCard.getCreditCardType();
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        creditCard.setCreditCardType(creditCardType);
    }

    public String getCreditCardExpiryDate() {
        return creditCard.getCreditCardExpDate();
    }

    public void setCreditCardExpiryDate(String creditCardExpiryDate) {
        creditCard.setCreditCardExpDate(creditCardExpiryDate);
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (!customer.equals(order.customer)) return false;
        if (orderDate != null && !orderDate.equals(order.orderDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderDate != null ? orderDate.hashCode() : 0;
        result = 31 * result + customer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Order");
        sb.append("{id=").append(id);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", customer=").append(customer);
        sb.append(", orderLines=").append(orderLines);
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append(", creditCard=").append(creditCard);
        sb.append('}');
        return sb.toString();
    }
}
