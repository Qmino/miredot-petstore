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
     * @param unitCost The price of one quantity.
     */
    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * The default image is: <img src="data:image/png;base64,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" />
     *
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