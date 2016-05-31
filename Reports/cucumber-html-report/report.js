$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Admin.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "In Order to add data from the backend, I need to login as an Admin\r\nIn order to use My Great Application\r\n  As a user  I want to be able to register",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login as an Administrator to add location, resorts, price etc",
  "description": "",
  "id": "registration;login-as-an-administrator-to-add-location,-resorts,-price-etc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "when user enter the login Id and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the system should enter the Admin Landing page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.when_user_enter_the_login_Id_and_Password()"
});
formatter.result({
  "duration": 8853341183,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_system_should_enter_the_Admin_Landing_page()"
});
formatter.result({
  "duration": 220289362,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "add new location to the database",
  "description": "",
  "id": "registration;add-new-location-to-the-database",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "when user navigate to Location Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User needs to add new location name, Image and description",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "sumbit to have new location updated into the system",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.when_user_navigate_to_Location_Tab()"
});
formatter.result({
  "duration": 6405216176,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_needs_to_add_new_location_name_Image_and_description()"
});
formatter.result({
  "duration": 415029504,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.sumbit_to_have_new_location_updated_into_the_system()"
});
formatter.result({
  "duration": 162823732,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "associate new location as Resort",
  "description": "",
  "id": "registration;associate-new-location-as-resort",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user navigates to Resort page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "choose location from the dropdown and click on addResort button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_Resort_page()"
});
formatter.result({
  "duration": 4391561761,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.choose_location_from_the_dropdown_and_click_on_addResort_button()"
});
formatter.result({
  "duration": 239052225,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Add Rooms to the selected resort",
  "description": "",
  "id": "registration;add-rooms-to-the-selected-resort",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I navigate to Rooms application",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I choose the resort and click on add room",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I choose add resort properties like charges, type and area",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Add Room",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_navigate_to_Rooms_application()"
});
formatter.result({
  "duration": 5249606182,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_choose_the_resort_and_click_on_add_room()"
});
formatter.result({
  "duration": 3281331686,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_choose_add_resort_properties_like_charges_type_and_area()"
});
formatter.result({
  "duration": 161186056,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Add_Room()"
});
formatter.result({
  "duration": 282055071,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "view Room",
  "description": "",
  "id": "registration;view-room",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user is in the add room page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user clicks on view room link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "choose the resort/location",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "system should display all the resorts and available rooms",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_the_add_room_page()"
});
formatter.result({
  "duration": 27590055,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_view_room_link()"
});
formatter.result({
  "duration": 133788138,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.choose_the_resort_location()"
});
formatter.result({
  "duration": 2306688360,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.system_should_display_all_tge_resorts_and_available_rooms()"
});
formatter.result({
  "duration": 108057455,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "\u0027Standard Registration\u0027",
  "description": "",
  "id": "registration;\u0027standard-registration\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I am not currently logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I am on the signup page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should click on Register Now link",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I fill in Choose UserName (required)",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I fill in Password (required with password",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I fill in Password confirmation with password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I fill in FirstName, Last Name and age (required)",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter Email Address, Address ,Contact Number, Occupation",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I add my Credit Card Number, PIN and MemberType",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on Register Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_am_not_currently_logged_in()"
});
formatter.result({
  "duration": 59689979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_am_on_the_signup_page()"
});
formatter.result({
  "duration": 62521939,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_click_on_Register_Now_link()"
});
formatter.result({
  "duration": 132760948,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_fill_in_Choose_UserName_required()"
});
formatter.result({
  "duration": 86049211,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_fill_in_Password_required_with_password()"
});
formatter.result({
  "duration": 73376416,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_fill_in_Password_confirmation_with_password()"
});
formatter.result({
  "duration": 69352636,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_fill_in_FirstName_Last_Name_and_age_required()"
});
formatter.result({
  "duration": 203023357,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_Email_Address_Address_Contact_Number_Occupation()"
});
formatter.result({
  "duration": 2335504311,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_add_my_Credit_Card_Number_PIN_and_MemberType()"
});
formatter.result({
  "duration": 340029371,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_Register_Button()"
});
formatter.result({
  "duration": 1352637299,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Login as Guest",
  "description": "",
  "id": "registration;login-as-guest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "I land into the sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "I verify that login form exist",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "I enter my credential and choose my privilege as Guest",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_land_into_the_sign_in_page()"
});
formatter.result({
  "duration": 6572593296,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_verify_that_login_form_exist()"
});
formatter.result({
  "duration": 274560929,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_my_credential_and_choose_my_privilege_as_Guest()"
});
formatter.result({
  "duration": 3000747608,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Proceed with application Hotel Reservation",
  "description": "",
  "id": "registration;proceed-with-application-hotel-reservation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "from the homePage I navigate to Hotel Reservation page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I choose a location to proceed to check if the rooms are available",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I finalise the reservation",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.from_the_homePage_I_navigate_to_Hotel_Reservation_page()"
});
formatter.result({
  "duration": 4724589236,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_choose_a_location_to_proceed_to_check_if_the_rooms_are_available()"
});
formatter.result({
  "duration": 1394773478,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_finalise_the_reservation()"
});
formatter.result({
  "duration": 760624263,
  "status": "passed"
});
});