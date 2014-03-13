package com.qmino.miredot.petstore.service;

@Path("/")
public class ShoppingStore {

   @Path("/customers/{id}")
   public Customer getCustomer(@PathParam("id") int id) {
      Customer cust = ...; // Find a customer object
      return cust;
   }
}