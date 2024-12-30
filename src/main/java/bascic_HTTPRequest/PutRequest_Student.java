package bascic_HTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;
public class PutRequest_Student {
	@Test
	public void Tc1()
	{
		LinkedHashMap<Object,Object>hs=new LinkedHashMap<>();
		 hs.put("id", "3");
		   hs.put("name", "Travis");
		   hs.put("phone", "33933");
		   hs.put("location", "Delhi");
		   String [] ar= {"SQL","DBMS"};
		   hs.put("courses", ar);
		
		given()
		   .contentType("application/json")
		   .body(hs)
	    .when()
	       .put("http://localhost:3000/students/3")
	    .then()
	       .statusCode(200)
	       .log().all();
	}

}
