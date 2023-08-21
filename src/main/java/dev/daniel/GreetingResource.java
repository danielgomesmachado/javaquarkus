package dev.daniel;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/olamundo")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Olá, mundo! Olá, pessoal da VITEC! Este é o meu primeiro programa usando o framework Quarkus!";
    }
}
