package com.qmino.miredot.petstore.domain;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

/**
 * Collection of rest parameters to illustrate @BeanParam and @Form functionality.
 * Annotations must be placed on the fields. Annotations on constructor parameters or
 * getter/setter methods are not supported.
 *
 * For javadoc documentation, MireDot follows the same visibility rules as for ordinary properties, so
 * add a gettermethod to see the javadoc (or change visibility settins in the pom)
 */
public class Credentials {

    /**
     * The id of this session
     */
    @CookieParam("sessionid")
    private String sessionId;

    /**
     * The ldapid of the user making the call
     */
    @HeaderParam("ldapId")
    private String ldapId;

    /**
     * Allows the caller to disable all serverside logging for this call
     */
    @QueryParam("dontlog")
    private boolean disableLogging;

    public String getSessionId() {
        return sessionId;
    }

    public String getLdapId() {
        return ldapId;
    }

    public boolean isDisableLogging() {
        return disableLogging;
    }
}
