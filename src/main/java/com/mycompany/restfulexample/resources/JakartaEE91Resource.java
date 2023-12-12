package com.mycompany.restfulexample.resources;

import com.mycompany.restfulexample.TestDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("jakartaee9")
public class JakartaEE91Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE")
                .build();
    }
    @GET
    @Path("/stuff")
    @Produces("application/xml")
    public TestDTO getStuff(){
        return new TestDTO();
    }
}
