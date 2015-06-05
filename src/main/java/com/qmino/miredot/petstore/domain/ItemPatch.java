package com.qmino.miredot.petstore.domain;

/**
 * Created by gerrit on 15.05.15.
 */
public class ItemPatch {

    /**
     * The field to replace.
     */
    private String replace;

    /**
     * The new value.
     */
    private String value;

    public String getReplace() {
        return replace;
    }

    public void setReplace(String replace) {
        this.replace = replace;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
