$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("setBackground.feature");
formatter.feature({
  "line": 1,
  "name": "setBackground",
  "description": "",
  "id": "setbackground",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2141450100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background",
  "description": "",
  "id": "setbackground;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@BlueBackground"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to find the Set SkyBlue Background button",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the blue button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepDefinition.I_want_to_find_the_Set_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 388761500,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepDefinition.I_click_on_the_blue_button()"
});
formatter.result({
  "duration": 45600200,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 21450700,
  "status": "passed"
});
formatter.before({
  "duration": 1223827300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Sky White Background",
  "description": "",
  "id": "setbackground;sky-white-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@WhiteBackground"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I want to find the Set SkyWhite Background button",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the white button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to sky white",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepDefinition.I_want_to_find_the_Set_SkyWhite_Background_button()"
});
formatter.result({
  "duration": 301990800,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepDefinition.I_click_on_the_white_button()"
});
formatter.result({
  "duration": 50787800,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepDefinition.the_background_color_will_change_to_sky_white()"
});
formatter.result({
  "duration": 17666300,
  "status": "passed"
});
});