package bascic_HTTPRequest;

import static io.restassured.RestAssured.given;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PatchRequest_Students {

	@Test
	public void Tc1()
	{
		LinkedHashMap<Object,Object>hs=new LinkedHashMap<>();
		   
		   String [] ar= {"SQL","DataAnalyst"};
		   hs.put("courses", ar);
		
		given()
		     .contentType("application/json")
		     .body(hs)
	    .when()
	          .patch("http://localhost:3000/students/2")
	    .then()
	          .statusCode(200)
	          .log().all();
	} 
}
