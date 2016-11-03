package org.vote2017.choose.idea.api;

import org.vote2017.choose.idea.service.IdeaService;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Marc ABOU CHACRA on 31/10/16.
 */
@Path(value = "/ideas")
@Model
public class IdeaEndPoint {

    @Inject
    private IdeaService ideaService;

    @GET
    @Produces(value = "application/json")
    public Response findAll(){
        return Response.ok(ideaService.findAll(), MediaType.APPLICATION_JSON_TYPE).build();
    }


    @GET
    @Path("1")
    @Produces(value = "application/json")
    public Response findOne(){
        return Response.ok(ideaService.findOne(), MediaType.APPLICATION_JSON_TYPE).build();
    }
}
