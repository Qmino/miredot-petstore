package com.qmino.miredot.petstore.service;

import com.qmino.miredot.petstore.exceptions.AuthorizationException;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 20/05/13<br>
 * <i>Creation-Time</i>:  15:12<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
@Path("/test")
public interface MireDotStatusCodesTestService {
    /**
     * Testing the default status code text by not specifying the @throws param
     * @summary Testing the default status code text
     */
    @DELETE
    @Path("/statusCodes/default")
    public void defaultStatusCodeTest() throws AuthorizationException;

    /**
     * Testing the default status code text by specifying the @throws param and no description.
     * @summary Testing the default status code text
     * @throws AuthorizationException
     */
    @DELETE
    @Path("/statusCodes/default/empty")
    public void defaultStatusCodeTestEmpty() throws AuthorizationException;

    /**
     * Testing the custom status code text by specifying the @throws param with the FQN of the exception.
     * @summary Testing the custom status code text (FQN)
     * @throws com.qmino.miredot.petstore.exceptions.AuthorizationException  Custom status code text.
     */
    @DELETE
    @Path("/statusCodes/custom/fqn")
    public void customStatusCodeTestFqn() throws AuthorizationException;

    /**
     * Testing the custom status code text by specifying the @throws param with the simple name of the exception.
     * @summary Testing the custom status code text
     * @throws AuthorizationException Custom status code text.
     */
    @DELETE
    @Path("/statusCodes/custom/simple")
    public void customStatusCodeTestSimple() throws AuthorizationException;

}
