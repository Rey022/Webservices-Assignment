package RestAssigmnet;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;

public class Ques1 {
	@Test(enabled=false)
	public void ques101(){
		String str=given()
		.when()
		.get("URI")
		.then()
		.extract().response().jsonPath().getString("username");
		System.out.println("user name is: "+str);
		
		
	}
	@Test
	public void ques102() {
		String str1=given()
				.when()
				.get("URI")
				.then()
				.extract().response().jsonPath().getString("sessionid");
				System.out.println("session id is: "+str1);
				
		
		
	}
	@Test
	public void ques103() {
		String str3=given()
				.when()
				.get("URI")
				.then()
				.extract().response().jsonPath().getString("sessionid");
				System.out.println("session id is: "+str3);
				
				
	}
	@Test
	public void ques104() {
		given()
		.when()
		.get("URI")
		.then()
		.extract().response().jsonPath().getString("marks[1]");
		
	}
	@Test
	public void ques108() {
		given()
		.when()
		.get("URI")
		.then()
		.extract().response().jsonPath().getString("contact");
	}
	@Test
	public void ques109() {
		given()
		.when()
		.get("URI")
		.then()
		.extract().response().jsonPath().getString("address[0]");
	}
	
	
	

}
