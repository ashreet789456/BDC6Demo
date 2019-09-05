$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/a.ningayya.salimath/Selenium week 3/MyDemo_01_Cucumber/Demo_01/Demo_01_01.feature");
formatter.feature({
  "name": "BDC Validation on demowebshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registered user access to cart in DemoWebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user launched demo webshop app in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo_01_01_definitions.user_launched_demo_webshop_app_in_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for the item of his choice",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo_01_01_definitions.user_searches_for_the_item_of_his_choice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds that item to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "Demo_01_01_definitions.adds_that_item_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Registered user access track the ordered item in DemoWebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user has already placed a order for his favourite item",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo_01_01_definitions.user_has_already_placed_a_order_for_his_favourite_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries access the order tracking dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo_01_01_definitions.user_tries_access_the_order_tracking_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "identifies the state of the order",
  "keyword": "And "
});
formatter.match({
  "location": "Demo_01_01_definitions.identifies_the_state_of_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/a.ningayya.salimath/Selenium week 3/MyDemo_01_Cucumber/Demo_01/Demo_01_02.feature");
formatter.feature({
  "name": "Guest user actions in Demo Webshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Users choice to opt for an account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user acess the sign-up page",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo_01_02_definiions.user_acess_the_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gets the credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Demo_01_02_definiions.gets_the_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Registered User access to login page of the Demo Webshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user has valid account creds for DemoWebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo_01_02_definiions.user_has_valid_account_creds_for_DemoWebshop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "provide the valid creds",
  "keyword": "And "
});
formatter.match({
  "location": "Demo_01_02_definiions.provide_the_valid_creds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies the state for the login status",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo_01_02_definiions.verifies_the_state_for_the_login_status()"
});
formatter.result({
  "status": "passed"
});
});