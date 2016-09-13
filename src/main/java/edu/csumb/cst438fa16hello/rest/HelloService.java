package edu.csumb.cst438fa16hello.rest;

import edu.csumb.cst438fa16hello.DayOfWeek;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * REST service that greets requests.
 *
 * See:
 * https://jersey.java.net/documentation/latest/jaxrs-resources.html
 */
@Path("/")
public class HelloService {
    @GET
    @Path("/hello")
    public Response hello(
        @QueryParam("name") String name) {
	if (name == null || name.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
	    return Response.ok("hello " + name).build();
	}
    }
}
