package edu.csumb.cst438fa16hello.rest;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

/**
 * See:
 * https://jersey.java.net/documentation/latest/deployment.html
 * http://buraktas.com/resteasy-example-without-using-a-web-xml/
 * http://stackoverflow.com/a/26721737
 */
@ApplicationPath("rest")
public class HelloApplication extends Application {
}
