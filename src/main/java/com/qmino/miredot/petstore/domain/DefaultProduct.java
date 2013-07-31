package com.qmino.miredot.petstore.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 11/06/13<br>
 * <i>Creation-Time</i>:  10:06<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
public class DefaultProduct extends Product {
    @JsonProperty("default")
    private boolean _default;
}
