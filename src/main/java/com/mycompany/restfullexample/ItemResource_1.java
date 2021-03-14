/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfullexample;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ramon
 */
public class ItemResource_1 {

    private String name;

    /**
     * Creates a new instance of ItemResource_1
     */
    private ItemResource_1(String name) {
        this.name = name;
    }

    /**
     * Get instance of the ItemResource_1
     */
    public static ItemResource_1 getInstance(String name) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of ItemResource_1 class.
        return new ItemResource_1(name);
    }

    /**
     * Retrieves representation of an instance of com.mycompany.restfullexample.ItemResource_1
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ItemResource_1
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource ItemResource_1
     */
    @DELETE
    public void delete() {
    }
}
