package edu.csumb.cst438fa16hello.rest;

import static org.junit.Assert.*;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 * See:
 * https://jersey.java.net/documentation/latest/test-framework.html
 * https://jersey.java.net/apidocs/latest/jersey/index.html
 */
public class HelloServiceTest extends JerseyTest {
    @Override
    protected Application configure() {
        return new ResourceConfig(HelloService.class);
    }

    @Test
    public void testHelloWithNonEmptyName() {
        String thehello = target().path("hello").queryParam("name", "Alan").request().get(String.class);
        assertEquals("hello Alan", thehello);
    }

    @Test
    public void testHelloWithEmptyName() {
        Response response = target().path("hello").queryParam("name", "").request().get();
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
    }

    @Test
    public void testHelloWithoutName() {
        Response response = target().path("hello").request().get();
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
    }
}
