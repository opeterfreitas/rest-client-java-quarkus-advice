package com.opeterfreitas.restclient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface AdviceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/advice")
    String getRandomAdvice();
}