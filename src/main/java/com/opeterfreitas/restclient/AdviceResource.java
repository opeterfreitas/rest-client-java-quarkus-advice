package com.opeterfreitas.restclient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/advice")
public class AdviceResource {

    @Inject
    @RestClient
    AdviceService adviceService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRandomAdvice() {
        String response = adviceService.getRandomAdvice();
        return Response.ok(response).build();
    }
}