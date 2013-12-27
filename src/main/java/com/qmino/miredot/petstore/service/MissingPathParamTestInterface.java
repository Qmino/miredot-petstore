package com.qmino.miredot.petstore.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 7/08/13<br>
 * <i>Creation-Time</i>:  14:41<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
@Path("test/jaxrs/{interfacepath}")
public interface MissingPathParamTestInterface {
    /**
     * The {secondparam} has been forgotten in the path.
     *
     * @param first  the first param, included in the path
     * @param second the second param, forgotten in the path
     * @return Een string.
     */
    @Path("{firstparam}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test(@PathParam("firstparam") String first, @PathParam("secondparam") String second);

    /**
     * This should work without problems.
     *
     * @param interfacepath a path param defined in the interface path
     * @return Een string.
     */
    @Path("interfacepath")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testInterfacePath(@PathParam("interfacepath") String interfacepath);

}
