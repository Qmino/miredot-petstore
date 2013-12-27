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
public interface MireDotPathNotOnInterfaceTestService {
    /**
     * This method should be documented, although the interface has no @Path annotation.
     *
     * @return Nothing meaningful.
     * @summary Test @Path on method, but not on interface
     */
    @GET
    @Path("/test/path/notoninterface")
    @Produces(MediaType.TEXT_PLAIN)
    public String testingPathNotOnInterface();
}
