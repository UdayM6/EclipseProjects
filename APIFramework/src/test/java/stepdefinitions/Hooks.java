package stepdefinitions;

import io.cucumber.java.Before;

public class Hooks {

	//need not mention hooks path in test runner
	
	 /*pre-requisite for delete place is place_id 
	if only delete place feature is initiated place_id should be generated*/
	@Before("@DeletePlace")
	public void beforeDeletePlaceAPI() throws Throwable {

		StepDefinitions sd = new StepDefinitions();
//run this method only when place id is null
		if (StepDefinitions.place_id == null) {

			sd.add_place_payload_with("MUK", "Hindi", "India");
			sd.user_calls_with_http_request("AddPlaceAPI", "POST");
			sd.verify_place_id_created_maps_to_using("MUK", "/maps/api/place/get/json");
		}
	}
}
