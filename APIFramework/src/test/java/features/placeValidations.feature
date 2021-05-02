Feature: Validating Place APIs
@AddPlace
Scenario Outline: Verify place successfully added using AddPlaceAPI
	Given Add place payload with "<name>" "<language>" "<Address>"
	When user calls "AddPlaceAPI" with "post" http request
	Then response status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_id created maps to "<name>" using "getPlaceAPI"
	
Examples:
	|name | language | Address		 |
	|HYD  | ENG		 | Tech Mahindra |
	|CHE  | GER		 | Swisscom		 |

@DeletePlace
Scenario: Verify if Delete Place functionality is working
	Given DeletePlace payload
	When user calls "deletePlaceAPI" with "post" http request
	Then response status code 200
	And "status" in response body is "OK"