$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/searchFunction.feature");
formatter.feature({
  "name": "search box testing",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User navigates to the link",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the link",
  "keyword": "Given "
});
formatter.match({
  "location": "com.greenKart.stepDefs.addToCart.userNavigatesToTheLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userClicksOnSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see the typed text properly.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User enters random characters in the search box.",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will be able to see the typed letters in the search box.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userWillBeAbleToSeeTheTypedLettersInTheSearchBox()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User navigates to the link",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the link",
  "keyword": "Given "
});
formatter.match({
  "location": "com.greenKart.stepDefs.addToCart.userNavigatesToTheLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userClicksOnSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see the auto-suggestion after typing letters in the search box.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user types \"c\" in the search box",
  "keyword": "Given "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userTypesInTheSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will see the product results containing \"c\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userWillSeeTheProductResultsContaining(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat java.lang.String.contains(String.java:2133)\r\n\tat com.greenKart.pages.SearchFunctionPage.searchALetter(SearchFunctionPage.java:63)\r\n\tat com.greenKart.stepDefs.searchFunctionStepDef.userWillSeeTheProductResultsContaining(searchFunctionStepDef.java:82)\r\n\tat ✽.user will see the product results containing \"c\"(file:///C:/Users/Armagan/GreenKartLast/src/test/resources/Feature/searchFunction.feature:56)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});