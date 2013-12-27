package com.qmino.miredot.petstore.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 23/05/13<br>
 * <i>Creation-Time</i>:  12:17<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
@Path("test")
public interface MireDotPathConcatenationTestService {
    /**
     * Testing the path concatenation
     *
     * @return Nothing meaningful.
     * @summary Testing the path concatenation
     */
    @GET
    @Path("path/concatenation")
    @Produces(MediaType.TEXT_PLAIN)
    public String testingPathConcatenation();

    /**
     * Testing the path concatenation with trailing slash
     *
     * @return Nothing meaningful.
     * @summary Testing the path concatenation
     */
    @GET
    @Path("path/concatenation/trailing/")
    @Produces(MediaType.TEXT_PLAIN)
    public String testingPathConcatenation2();

    /**
     * Testing the path concatenation with starting slash
     *
     * @return Nothing meaningful.
     * @summary Testing the path concatenation
     */
    @GET
    @Path("/path/concatenation/starting")
    @Produces(MediaType.TEXT_PLAIN)
    public String testingPathConcatenation3();
}
