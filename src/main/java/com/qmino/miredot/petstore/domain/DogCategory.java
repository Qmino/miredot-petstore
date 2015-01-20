package com.qmino.miredot.petstore.domain;

/**
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
public class DogCategory extends Category {

    /**
     * The name of the category.
     */
    private String name;

    /**
     * The dog food category. This is the dog food that is best suited for dogs of this category.
     */
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
