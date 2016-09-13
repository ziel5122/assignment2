package edu.csumb.assignment2.rest;

import edu.csumb.assignment2.DayOfWeek;
import edu.csumb.assignment2.QuestionsAnswers;
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
public class QuestionsAnswersService {
    private QuestionsAnswers qa = new QuestionsAnswers();
	
    @GET
    @Path("/randomquestion")
    public Response randomquestion() {
      return Response.ok(qa.getRandomQuestion()).build();
    }

    @GET
    @Path("/testanswer")
    public Response testanswer(
      @QueryParam("question") String question,
      @QueryParam("answer") String answer) {
      System.out.println(question);
      System.out.println("answer" + answer);
      boolean right = qa.testAnswer(question, answer);
      if (right)
	return Response.ok("CORRECT").build();
      else
	return Response.ok("INCORRECT. The correct answer is \"" + qa.get(question) + "\"").build();
    }
}
