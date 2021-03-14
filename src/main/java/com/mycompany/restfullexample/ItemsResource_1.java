/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfullexample;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ramon
 */
@Path("/Items")
public class ItemsResource_1 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ItemsResource_1
     */
    public ItemsResource_1() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.restfullexample.ItemsResource_1
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * Sub-resource locator method for {name}
     */
    @Path("{name}")
    public ItemResource_1 getItemResource_1(@PathParam("name") String name) {
        return ItemResource_1.getInstance(name);
    }
}
