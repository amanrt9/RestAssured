package bascic_HTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;

public class PostRequest_Students {
   @Test
   public void Tc1() 
   {
	   LinkedHashMap<Object,Object>hs=new LinkedHashMap<>();
	   
	   hs.put("id", "3");
	   hs.put("name", "Travis");
	   hs.put("phone", "3333");
	   hs.put("location", "Delhi");
	   String [] ar= {"SQL","DBMS"};
	   hs.put("courses", ar);
	   
	   given()
	          .contentType("application/json")
	          .body(hs)
	    .when()
	          .post("http://localhost:3000/students")
	    .then()
	         .statusCode(201)
	         .log().all();
	      
	   
   }
}
