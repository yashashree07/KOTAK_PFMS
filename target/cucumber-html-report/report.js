$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/setupFeatures/TC-Calendar.feature");
formatter.feature({
  "name": "To Test The Functionality Of Calender Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Version1.0"
    },
    {
      "name": "@Regression_Pack_User_Menu"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To Approve Calendar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_05_05_ApproveCalendar"
    }
  ]
});
formatter.step({
  "name": "User goes to GPS and open Calendar Approve menu to approve Calendar",
  "keyword": "Then "
});
formatter.step({
  "name": "User Approves Calendar using \"\u003cSheetName\u003e\" and view the record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName"
      ]
    },
    {
      "cells": [
        "Calendar_Approve_View"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To Approve Calendar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Version1.0"
    },
    {
      "name": "@Regression_Pack_User_Menu"
    },
    {
      "name": "@TC_05_05_ApproveCalendar"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes to GPS and open Calendar Approve menu to approve Calendar",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarStepDefination.user_goes_to_GPS_and_open_Calendar_Approve_menu_to_approve_Calendar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Approves Calendar using \"Calendar_Approve_View\" and view the record",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarStepDefination.user_Approves_Calendar_using(String)"
});
