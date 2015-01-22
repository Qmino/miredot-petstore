package com.qmino.miredot.petstore.service;

import com.qmino.miredot.petstore.domain.Credentials;
import com.qmino.miredot.petstore.domain.Order;
import org.jboss.resteasy.annotations.Form;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 13/05/13<br>
 * <i>Creation-Time</i>:  14:39<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 * @servicetag sales
 */
@Path("/sales")
public interface SalesService {
    /**
     * Get the orders of a customer
     *
     * @param customerId The id of the customer to get the orders for
     * @param credentials The credentials of the caller
     * @return All orders of the customer with specified id
     * @summary Get the orders of a customer
     */
    @GET
    @Path("/order")
    @Produces({MediaType.APPLICATION_JSON})
    public Order[] getOrders(@QueryParam("customerId") Long customerId, @BeanParam Credentials credentials);

    /**
     * Get the order with the specified id
     *
     * @param orderId The order id
     * @param credentials The credentials of the caller
     * @return The order with the specified id
     * @summary Get the order with the specified id
     */
    @GET
    @Path("/order/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Order getOrder(@PathParam("id") Long orderId, @BeanParam Credentials credentials);

    /**
     * Get the status of the order with specified id
     *
     * @param orderId The order id
     * @param credentials The credentials of the caller
     * @return The status of the order with specified id
     * @summary Get the order status
     * @servicetag status
     */
    @GET
    @Path("/order/{id}/status")
    @Produces(MediaType.TEXT_PLAIN)
    public String getOrderStatus(@PathParam("id") Long orderId, @Form Credentials credentials);
}
