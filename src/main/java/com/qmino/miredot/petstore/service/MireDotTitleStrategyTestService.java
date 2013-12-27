package com.qmino.miredot.petstore.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 31/07/13<br>
 * <i>Creation-Time</i>:  11:07<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
@Path("test/title/")
public interface MireDotTitleStrategyTestService {

    /**
     * The first sentence will be used as the title of this interface.
     * <title>
     * <strategy>firstsentence</strategy>
     * </title>
     *
     * @return A number
     */
    @Path("firstsentence")
    @GET
    public int firstSentence();

    /**
     * The content from the @title tag will be the title of this interface.
     * <title>
     * <strategy>tag: title</strategy>
     * </title>
     *
     * @return A number
     * @title The title from the @title tag.
     */
    @Path("titletag")
    @GET
    public int titleTag();

    /**
     * The content from the @summary tag will be the title of this interface.
     * <title>
     * <strategy>tag: summary</strategy>
     * </title>
     *
     * @return A number
     * @title The title from the @title tag
     * @summary The title from the @summary tag.
     */
    @Path("summarytag")
    @GET
    public int summaryTag();
}
