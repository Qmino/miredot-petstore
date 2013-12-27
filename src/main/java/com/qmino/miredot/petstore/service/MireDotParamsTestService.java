package com.qmino.miredot.petstore.service;

import com.qmino.miredot.petstore.domain.CreditCardType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 15/05/13<br>
 * <i>Creation-Time</i>:  17:44<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
@Path("/test")
public interface MireDotParamsTestService {
    /**
     * Deletes item with given id.
     *
     * @summary Delete item with given id
     * @deprecated This method is deprecated. Use something else.
     */
    @DELETE
    @Path("/deprecated/")
    public void deprecated();

    /**
     * Testing enums
     *
     * @param creditCardTypePath   a credit card type
     * @param creditCardTypeQuery  a credit card type
     * @param creditCardTypeForm   a credit card type
     * @param creditCardTypeCookie a credit card type
     * @param creditCardTypeHeader a credit card type
     * @param creditCardTypeMatrix a credit card type
     * @param creditCardTypeBody   a credit card type
     * @return a credit card type
     * @summary Testing enums
     */
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/enum/{creditCardType}")
    public CreditCardType testEnum(
            @PathParam("creditCardType") CreditCardType creditCardTypePath,
            @QueryParam("creditCardTypeQuery") CreditCardType creditCardTypeQuery,
            @FormParam("creditCardTypeForm") CreditCardType creditCardTypeForm,
            @CookieParam("creditCardTypeCookie") CreditCardType creditCardTypeCookie,
            @HeaderParam("creditCardTypeHeader") CreditCardType creditCardTypeHeader,
            @MatrixParam("creditCardTypeMatrix") CreditCardType creditCardTypeMatrix,
            CreditCardType creditCardTypeBody
    );

    /**
     * Testing lists
     *
     * @param listPath   a list of strings
     * @param listQuery  a list of strings
     * @param listForm   a list of strings
     * @param listCookie a list of strings
     * @param listHeader a list of strings
     * @param listMatrix a list of strings
     * @param listBody   a list of strings
     * @return a list of strings
     * @summary Testing lists
     */
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/list/{list}")
    public List<String> testList(
            @PathParam("list") List<String> listPath,
            @QueryParam("listQuery") List<String> listQuery,
            @FormParam("listForm") List<String> listForm,
            @CookieParam("listCookie") List<String> listCookie,
            @HeaderParam("listHeader") List<String> listHeader,
            @MatrixParam("listMatrix") List<String> listMatrix,
            List<String> listBody
    );

    /**
     * Testing matrix, form, cookie and header params.
     *
     * @param matrix A value that's stored in a matrix param
     * @param form   A value that's stored in a form param
     * @param cookie A value that's stored in a cookie
     * @param header A value that's sent in a header
     * @summary Testing matrix, form, cookie and header params
     */
    @DELETE
    @Path("/params/")
    public void headerParams(@MatrixParam("author") String matrix,
                             @FormParam("author") String form,
                             @CookieParam("cookie") String cookie,
                             @HeaderParam("header") String header);
}
