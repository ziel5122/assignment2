package edu.csumb.assignment2.rest;

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
public class QuestionsAnswersServiceTest extends JerseyTest {
    @Override
    protected Application configure() {
        return new ResourceConfig(QuestionsAnswersService.class);
    }

    @Test
    public void testTestAnswerWithEmptyAnswer() {
	Response response = target().path("testanswer").queryParam("question", "anything really").queryParam("answer", "").request().get();
	assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
    }

    @Test
    public void testTestAnswerWithNonEmptyAnswer() {
	String theoutcome = target().path("testanswer").queryParam("question", "What is the last name of the philosopher famous for writing: \"I think, therefore I am\"?").queryParam("answer", "decartes").request().get(String.class);
	assertEquals(theoutcome, "CORRECT");
    }
}
