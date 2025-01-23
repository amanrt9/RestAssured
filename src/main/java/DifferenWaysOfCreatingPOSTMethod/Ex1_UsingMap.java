package DifferenWaysOfCreatingPOSTMethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;

public class Ex1_UsingMap {
	@Test
	public void Tc1() {
		LinkedHashMap<Object,Object>hs=new LinkedHashMap<>();
		   hs.put("id", "4");
		   hs.put("name", "Mark");
		   hs.put("phone", "4444");
		   hs.put("location", "Perth");
		   String [] ar= {"MySQL","Oracle"};
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
