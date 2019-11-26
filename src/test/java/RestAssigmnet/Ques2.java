package RestAssigmnet;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Ques2 {
	@Test
	public void get_json() {
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/posts")
		.then()
		.body("id[6]",is(7));
		//.extract().response().prettyPrint();
		
		
	}

}
