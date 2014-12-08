package com.qmino.miredot.petstore.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Item implements HasUnitCost {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private String name;
    private String description;
    private Float unitCost;
    private String imagePath;
    @XmlTransient
    private Product product;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Item() {
    }

    public Item(String name, Float unitCost, String imagePath, Product product, String description) {
        this.name = name;
        this.unitCost = unitCost;
        this.imagePath = imagePath;
        this.product = product;
        this.description = description;
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
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The price of one quantity.
     */
    public Float getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the unit cost.
     *
     * @param unitCost The price of one quantity.
     */
    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * @return URL that refers to an image for the item.
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath URL that refers to an image for the item.
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return The product referenced by this item.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product referenced by this item.
     *
     * @param product The product referenced by this item.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return An item-specific description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description An item-specific description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (!imagePath.equals(item.imagePath)) return false;
        if (!name.equals(item.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + imagePath.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Item");
        sb.append("{id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", unitCost=").append(unitCost).append('\'');
        sb.append(", imagePath='").append(imagePath).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}