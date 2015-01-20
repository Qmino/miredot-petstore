package com.qmino.miredot.petstore.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
public class DefaultProduct extends Product {

    /**
     * Sets if this is a default product.
     */
    @JsonProperty("default")
    private boolean _default;
}
