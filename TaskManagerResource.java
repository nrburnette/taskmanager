package com.dropwizard.taskmanager;

//import com.dropwizard.taskmanager.TaskManagerResource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
//added to check aws rds connectivity
import javax.ws.rs.core.Response;
import org.jdbi.v3.core.Jdbi;


//original TaskManagerResource setup
@Path("test") 
public class TaskManagerResource {
	 
	/* 
	 * The @Path annotation provides the URL path for this API end-point. 
	 *  
	 *For example, if you are running this on your local machine with 
	 *at the TCP/IP port 8080, the @Path ("hello") annotation would 
	 *make this end-point available at http://localhost:8080/hello 
	 * 
	 *This annotation must appear immediately before the definition 
	 *of your class. 
	 */ 


	 /* 
	  * This @GET annotation indicates that the end-point is 
	  * accessed via an HTTP GET operation. While the @Produces  
	  * annotation indicates that the data returned to the user 
	  * will be in plain text. 
	  *  
	  * These annotations should immediately proceed the method  
	  * definition.  
	  *  
	  * The getGreeting method will execute when the "hello" 
	  * end-point is accessed. 
	  */ 

	 private final Jdbi jdbi;

	 public TaskManagerResource(Jdbi jdbi) {
	        this.jdbi = jdbi;
	 }

	 @GET 
	 @Produces(MediaType.TEXT_PLAIN) 
	 public String getGreeting() { 
	  return "task manager test PASSED, Good Job Nick!"; 
	 } 
}
