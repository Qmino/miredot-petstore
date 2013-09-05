package com.qmino.miredot.petstore.domain;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 10/06/13<br>
 * <i>Creation-Time</i>:  19:29<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
public class CatCategory extends Category {
    private String name;
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
