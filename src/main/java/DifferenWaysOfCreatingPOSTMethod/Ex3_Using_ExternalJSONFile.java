package DifferenWaysOfCreatingPOSTMethod;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Ex3_Using_ExternalJSONFile {
       @Test
       public void Tc()
       {
    	  File f=new File("C:\\Users\\Hp\\Workspace1\\RestAssuredd\\JsonFiles\\StudentsData.json"); 
    	  
    	  given()
    	     .contentType("application/json")
    	     .body(f)
    	  .when()
    	      .post("http://localhost:3000/students")
    	  .then()
    	       .statusCode(201)
    	       .log().all();
       }
}
