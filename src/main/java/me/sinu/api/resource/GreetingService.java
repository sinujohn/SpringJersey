package me.sinu.api.resource;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.sinu.api.payload.IdPayload;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "Simple Spring JAX-RS service with Swagger documentation")
public interface GreetingService {
    @Path("/greet")
    @GET
    @Produces("text/plain")
    @ApiOperation(
            value = "Get operation with String value",
            notes = "Returns Hello World!",
            response = String.class
    )
    String greet();

    @Path("/greetJson")
    @GET
    @Produces("application/json")
    @ApiOperation(
            value = "Get operation with a JSON object",
            notes = "Get operation that serialises Java object using JSON parser",
            response = IdPayload.class
    )
    IdPayload greetWithId();

}
