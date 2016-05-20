package me.sinu.api.resource;


import me.sinu.api.payload.IdPayload;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public interface GreetingService {
    @Path("/greet")
    @GET
    String greet();

    @Path("/greetJson")
    @GET
    @Produces("application/json")
    IdPayload greetWithId();

}
