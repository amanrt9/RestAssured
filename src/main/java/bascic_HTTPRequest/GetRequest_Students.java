package bascic_HTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetRequest_Students {
	@Test
	public void Tc1()
	{
		given()
		.contentType("application/json")
		.when()
		.get("http://localhost:3000/students/1")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority=2)
	public void Tc2()
	{
		given()
		.contentType("application/json")
		.when()
		.get("http://localhost:3000/students/4")
		.then()
		.statusCode(200)
		.log().all();
	}


}
