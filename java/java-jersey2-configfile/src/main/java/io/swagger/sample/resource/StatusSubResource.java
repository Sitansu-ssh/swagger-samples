package io.swagger.sample.resource;

import io.swagger.v3.oas.annotations.Operation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
public class StatusSubResource {
    @Path("/otherStatus")
    @GET
    @Operation(description = "Get the other status!")
    public String otherStatus() {
        return "{\"a\":\"Still Ok!\"}";
    }
}