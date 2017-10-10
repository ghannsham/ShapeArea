package com.gk.rest.ShapeArea;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gk.rest.model.Shape;
import com.gk.rest.service.AreaService;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	AreaService areaService = new AreaService();
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("/area")
    @Produces(MediaType.APPLICATION_JSON)
    public Shape getShape() {
        return new Shape(1,1);
    }
    
    @POST
	@Path("/area")
    @Consumes(MediaType.APPLICATION_JSON)
	public Response calculateArea(Shape shape) {
    		long area = areaService.calculateArea(shape);
			return Response.status(200)
				.entity("Area is : " + area)
				.build();
		}
}
