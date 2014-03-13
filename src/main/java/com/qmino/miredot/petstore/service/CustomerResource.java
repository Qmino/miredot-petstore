package com.qmino.miredot.petstore.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class CustomerResource {
   
    @GET
    public String get() {
        return null;
    }

    @Path("/address")
    public String getAddress() {
        return null;
    }

}