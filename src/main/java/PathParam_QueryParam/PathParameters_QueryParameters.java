package PathParam_QueryParam;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PathParameters_QueryParameters{

	//@Test
	public void Tc()
	{   
		
		
		given()                                				
	        .contentType("application/json")
	        .pathParam("p1", "api")
	        .pathParam("p2", "users")
	        .queryParam("page", "2")
	        .queryParam("id", "5")
       .when()											
	        .get("https://reqres.in/{p1}/{p2}")  //OR .get("https://reqres.in/api/users?page=2&id=5")  
       .then()                                            
	        .statusCode(200)
	        .log().all();

	}
	@Test
	 public void Tc1()
	 {
		given()
		      .contentType(ContentType.JSON)
		      .pathParams("p1","api","p2","users")
		      .queryParams("page","2","id","7")
		.when()
		      .get("https://reqres.in/{p1}/{p2}")
		 .then()                                            
	          .statusCode(200)
	          .log().all();

		    
		   
	 }
}
