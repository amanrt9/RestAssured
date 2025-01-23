
package Cookies_Headers;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Header1 {
	//@Test
			public void testHeades()	
			{
				given()			
				.when()
					.get("https://google.com/")			
				.then()
					 .header("Content-Type", "text/html; charset=ISO-8859-1")
					.log().headers();
			}
		//@Test(priority = 2)
			public void getHeadersInfo()
			{
				 Response resp = given()			
						 		.when()
						 			.get("https://google.com/");
				
				String headerValue = resp.getHeader("Content-Type");
				 System.out.println("----Content type----"+headerValue);
			}
		
		@Test(priority = 2)
		public void getHeaders()
		{
			 Response resp = given()			
					 		.when()
					 			.get("https://google.com/");
			Headers h= resp.headers();
			for(Header h1:h)
			{
				System.out.println(h1.getName()+":"+h1.getValue());
			}

		}
			
			
}
