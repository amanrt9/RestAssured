package bascic_HTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class DeleteRequest_Student {
	@Test
	public void Tc1() {
		given()
		   .contentType("application/json")
         .when()
            .delete("http://localhost:3000/students/11")
         .then()
             .statusCode(200)
             .log().all();
}
}
