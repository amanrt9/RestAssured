package bascic_HTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public
 class GetRequest {
	@Test
	public void Tc()
	{
		given()                                				 //Pre-req-
		    .contentType("application/json")
	    .when()												//request type
		    .get("https://reqres.in/api/users/2")    
	    .then()                                             //validation
		    .statusCode(200)
		    .log().all();
	
	
	
	}
	

}
