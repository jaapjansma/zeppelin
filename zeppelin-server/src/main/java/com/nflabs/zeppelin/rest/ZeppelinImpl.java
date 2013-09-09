package com.nflabs.zeppelin.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/zeppelin")
public class ZeppelinImpl {
	
    @GET
    @Produces("text/html")
    @Path("sayHi/{text}")
    public String sayHi(@PathParam("text") String text) {
        return "Hello " + text;
    }
}
