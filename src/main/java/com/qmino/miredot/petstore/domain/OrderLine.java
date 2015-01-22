package com.qmino.miredot.petstore.domain;

/**
 * One of more instances of a product in an order.
 * @param <T>
 */
public class OrderLine<T extends HasUnitCost> {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private Integer quantity;
    private T item;

    // ======================================
    // =            Constructors            =
    // ======================================

    public OrderLine() {
    }

    public OrderLine(Integer quantity, T item) {
        this.quantity = quantity;
        this.item = item;
    }

    // ======================================
    // =              Public Methods        =
    // ======================================

    /**
     * @return Total cost of the products in this orderline.
     */
    public Float getSubTotal() {
        return item.getUnitCost() * quantity;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    /**
     * @return The unique id.
     */
    public Long getId() {
        return id;
    }

    /**
     * @return Number of articles (always > 0)
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity Number of articles. Must be > 0.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return The item that this order line represents.
     */
    public T getItem() {
        return item;
    }

    /**
     * @param item The item that this order line represents.
     */
    public void setItem(T item) {
        this.item = item;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderLine)) return false;

        OrderLine orderLine = (OrderLine) o;

        if (id != null ? !id.equals(orderLine.id) : orderLine.id != null) return false;
        if (item != null ? !item.equals(orderLine.item) : orderLine.item != null) return false;
        if (!quantity.equals(orderLine.quantity)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + quantity.hashCode();
        result = 31 * result + (item != null ? item.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OrderLine");
        sb.append("{id=").append(id);
        sb.append(", quantity=").append(quantity);
        sb.append(", item=").append(item);
        sb.append('}');
        return sb.toString();
    }
}
