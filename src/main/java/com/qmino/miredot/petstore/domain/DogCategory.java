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
public class DogCategory extends Category {
    private String name;
    private Category dogFoodCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getDogFoodCategory() {
        return dogFoodCategory;
    }

    public void setDogFoodCategory(Category dogFoodCategory) {
        this.dogFoodCategory = dogFoodCategory;
    }
}
