$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resource/Christmaspage.feature");
formatter.feature({
  "line": 1,
  "name": "Christmas Product range",
  "description": "",
  "id": "christmas-product-range",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5155931200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User types Biscuit in searchbox and clicks magnifyingglass",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be able to get all the biscuit products",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on the result page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User clicks on christmas button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see all the christmas products",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_is_on_the_Homepage()"
});
formatter.result({
  "duration": 70121000,
  "status": "passed"
});
formatter.match({
  "location": "SearchBoxSteps.user_types_Biscuit_in_searchbox_and_clicks_magnifyingglass()"
});
formatter.result({
  "duration": 1258950100,
  "status": "passed"
});
formatter.match({
  "location": "SearchBoxSteps.user_should_be_able_to_get_all_the_biscuit_products()"
});
formatter.result({
  "duration": 15800,
  "status": "passed"
});
formatter.match({
  "location": "ResultPage_christmasbuttonsteps.user_is_on_the_result_page()"
});
formatter.result({
  "duration": 156400,
  "status": "passed"
});
formatter.match({
  "location": "ResultPage_christmasbuttonsteps.user_clicks_on_christmas_button()"
});
formatter.result({
  "duration": 1086570100,
  "status": "passed"
});
formatter.match({
  "location": "ResultPage_christmasbuttonsteps.user_should_be_able_to_see_all_the_christmas_products()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Click on one of the christmas biscuit",
  "description": "",
  "id": "christmas-product-range;click-on-one-of-the-christmas-biscuit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is on the webpage where user can see all the christmas products",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User clicks on add to basket button for mince pies",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be able to add the product into the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "Christmasproductsteps.user_is_on_the_webpage_where_user_can_see_all_the_christmas_products()"
});
formatter.result({
  "duration": 206100,
  "status": "passed"
});
formatter.match({
  "location": "Christmasproductsteps.user_clicks_on_add_to_basket_button_for_mince_pies()"
});
formatter.result({
  "duration": 4256523900,
  "status": "passed"
});
formatter.match({
  "location": "Christmasproductsteps.user_should_be_able_to_add_the_product_into_the_basket()"
});
formatter.result({
  "duration": 21900,
  "status": "passed"
});
formatter.after({
  "duration": 12400,
  "status": "passed"
});
});