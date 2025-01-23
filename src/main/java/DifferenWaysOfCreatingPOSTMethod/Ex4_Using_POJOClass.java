package DifferenWaysOfCreatingPOSTMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Ex4_Using_POJOClass {
   @Test
   public void Tc()
   {
	    StudentPojo s= new StudentPojo();
	    s.setId("7");
	    s.setName("Thala");
	    s.setPhone("7777");
	    s.setLocation("Ranchi");
	    String [] ar= {"JavaScript","PlayWrite"};
	    s.setCourses(ar);
	    
	    given()
	     .contentType(ContentType.JSON)
	     .body(s)
	  .when()
	      .post("http://localhost:3000/students")
	  .then()
	       .statusCode(201)
	       .log().all();
	   
   }
}
