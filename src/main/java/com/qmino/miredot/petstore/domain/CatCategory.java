package com.qmino.miredot.petstore.domain;

/**
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
public class CatCategory extends Category {
    /**
     * The name of the category.
     */
    private String name;

    /**
     * A product that is recommended for this category. This product is the <strong>best</strong> offer from the entire
     * catalog for this category.
     */
    private Product recommendedProduct;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getRecommendedProduct() {
        return recommendedProduct;
    }

    public void setRecommendedProduct(Product recommendedProduct) {
        this.recommendedProduct = recommendedProduct;
    }
}
