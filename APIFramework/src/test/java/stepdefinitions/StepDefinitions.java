package stepdefinitions;

import static org.junit.Assert.*; //static import

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given; //static import

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinitions extends Utils {

	RequestSpecification reqBuilder;
	ResponseSpecification resBuilder;
	Response response;
	
	static String place_id;
	

	TestDataBuild data = new TestDataBuild();

	@Given("Add place payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws Throwable {

		reqBuilder = given().spec(requestSpecification()) // CHECK IMPORT STATIC GIVEN ELSE ERROR
				.body(data.addPlacePayload(name, language, address));
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {

		APIResources resourceAPI = APIResources.valueOf(resource);

		resBuilder = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("POST")) {
			response = reqBuilder.when().post(resourceAPI.getResource());
		} else if (method.equalsIgnoreCase("GET")) {
			response = reqBuilder.when().get(resourceAPI.getResource());
		}
		// .then().spec(resBuilder).extract().response();
	}

	@Then("response status code {int}")
	public void response_status_code(Integer int1) {
		assertEquals((Integer) (response.getStatusCode()), int1);
		/*
		 * use Wrapper class Integer since asserEquals won't work for primitive data
		 * types int/byte/boolean
		 */
		// NOTE: ASSERTEQUALS IDE WON'T SUGGEST -- DUE TO STATIC PACKAGE
		// import static org.junit.Assert.*;
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) {
		/*
		String resp = response.toString();
		JsonPath js = new JsonPath(resp);
		assertEquals(js.get(keyValue).toString(), ExpectedValue);
		*/
		
		assertEquals(getJsonPath(response, keyValue), ExpectedValue);
	}

	@Then("verify place_id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
		
		place_id = getJsonPath(response, "place_id");
		reqBuilder = given().spec(requestSpecification()).queryParam("place_id", place_id);
		
		user_calls_with_http_request(resource,"GET");
		assertEquals(getJsonPath(response, "name"), expectedName);
		
	}
	
	@Given("DeletePlace payload")
	public void deleteplace_payload() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		reqBuilder = given().spec(requestSpecification()) // CHECK IMPORT STATIC GIVEN ELSE ERROR
				.body(data.deletePlacePayload(place_id));
	}

}
