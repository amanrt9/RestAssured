package DifferenWaysOfCreatingPOSTMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class Ex2_UsingOrgJSONLibrary {
	@Test
	public void Tc()
	{
		JSONObject o=new JSONObject();
		   o.put("id", "5");
		   o.put("name", "Smith");
		   o.put("phone", "5555");
		   o.put("location", "Sydeny");
		   String [] ar= {"Ruby","NoSql"};
		   o.put("courses", ar);
		   
		   given()
		       .contentType(ContentType.JSON)
               .body(o.toString())
           .when()
                .post("http://localhost:3000/students")
           .then()
                .statusCode(201)
                .log().all();
	}

}
