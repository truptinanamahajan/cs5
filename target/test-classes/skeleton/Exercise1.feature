Feature: Login Test

Description : User Story  

Scenario Outline: Login with valid test data

Given user lanches IE browser And navigates to application url
When User enter username as "<userName>" in username field
When User enter password as "<password>" in password field
And click Signin
Then validates Login Success


 Examples:
		| userName | password |
		| mercury | mercury |
		| mercury | abcd |
		| abcd | mercury |
		| abcd | prgd |