$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/setupFeatures/TC-User.feature");
formatter.feature({
  "name": "To Test The Functionality Of User Menu",
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
  "name": "To Approve the User",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC01_05_Approve_User"
    }
  ]
});
formatter.step({
  "name": "User goes to Administration and then User Approve menu",
  "keyword": "Given "
});
formatter.step({
  "name": "User goes to Approve screen and approves the record using \"\u003cSheetName\u003e\"",
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
        "User_ModifyRepairApproveView"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To Approve the User",
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
      "name": "@TC01_05_Approve_User"
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
  "name": "User goes to Administration and then User Approve menu",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDefination.user_goes_to_Administration_and_then_User_Approve_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to Approve screen and approves the record using \"User_ModifyRepairApproveView\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDefination.user_goes_to_Approve_screen_and_approves_the_record_using(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To View the User",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC01_06_View_User"
    }
  ]
});
formatter.step({
  "name": "User goes to Administration and then User List menu",
  "keyword": "Given "
});
formatter.step({
  "name": "User goes to List screen and views the record using \"\u003cSheetName\u003e\"",
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
        "User_ModifyRepairApproveView"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To View the User",
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
      "name": "@TC01_06_View_User"
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
  "name": "User goes to Administration and then User List menu",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDefination.user_goes_to_Administration_and_then_User_List_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to List screen and views the record using \"User_ModifyRepairApproveView\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDefination.user_goes_to_List_screen_and_views_the_record_using(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});