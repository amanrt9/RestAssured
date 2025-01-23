package Cookies_Headers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.Set;

public class Cookies {


	//@Test
	public void Tc()
	{
		given()

		.when()
		    .get("https://google.com/")

		.then()
			.statusCode(200)
			.cookie("AEC","AZ6Zc-V0XCfVHQ0nOj8o7Ehgk2L_nGiSFsl6SuQGG7zWOkf87_eqHu4EGXM")
			.log().cookies();
	}

	//@Test
	public void Tc01() {
		Response res=given()

		.when()
			.get("https://google.com/");
		
		String cookieValue=res.getCookie("AEC");
		System.out.println("Cookie Info ="+cookieValue);

	}
	@Test
	public void Tc02() {
		Response res=given()
				.when()
				   .get("https://google.com/");
		
		Map<String,String>allCookies=res.getCookies();
		Set<String>keys=allCookies.keySet();
		for(String key:keys)
		{
			System.out.println(key+":"+allCookies.get(key));
		}
		           
	}

}
