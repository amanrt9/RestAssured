package ParsingJsonData;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class ParsingJSONResponseData {
	//@Test(priority = 1)
	public void testJSONResponse1() 
	{
		//approach1: Normal way (without capturing response)
		
		given()    
			.contentType(ContentType.JSON)		
		.when()
			.get("http://localhost:3000/store")		
		.then()
		   .statusCode(200)
		   .body("book[0].auther",equalTo("Amol"))
		   .body("book[2].title",equalTo("Moby Dick"));
	}
	//@Test
	public void Tc1()
	{
		Response res=given()
		    .contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/store");
		    
		Assert.assertEquals(res.jsonPath().get("book[0].auther").toString(),"Amol");
		Assert.assertEquals(res.jsonPath().get("book[1].price").toString(),"100.00");
	}
	
	@Test
	public void Tc02()
	{
		Response res= given()
				 .contentType(ContentType.JSON)
			.when()
			     .get("http://localhost:3000/store");
		JSONObject o=new JSONObject(res.asString());
		
	  int length= o.getJSONArray("book").length()-1;
	  
	  for(int i=0;i<=length;i++)
	  {
		  String title=o.getJSONArray("book").getJSONObject(i).getString("title");
		  System.out.println(title);
	  }
	  
	}

}
