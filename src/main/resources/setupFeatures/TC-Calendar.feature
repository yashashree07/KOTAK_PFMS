#Author: Surva jankar
@Version1.0 @Regression_Pack_User_Menu
Feature: To Test The Functionality Of Calender Menu

  @TC_01_01_ViewCalendar
  Scenario Outline: To View Calendar
    Given User navigates to GPS and then to Static Data and clicks on Calendar menu and clicks on sub option View
    Then User goes to Calendar screen and views the record using "<SheetName>"

    Examples: 
      | SheetName     |
      | Calendar_View |

  @TC_02_02_CreateCalendarwithInvaliddata
  Scenario Outline: To Create Calendar with Invalid data
    Then User goes to GPS and open Calendar Create menu to add Calendar
    Then User add Calendar with invalid data using "<SheetName>"

    Examples: 
      | SheetName               |
      | Calendar_Create_Invalid |

  @TC_03_03_CreateCalendarwithValiddata
  Scenario Outline: To Create Calendar with Valid data
    Then User goes to GPS and open Calendar Create menu to add Calendar
    Then User add Calendar with valid data using "<SheetName>"

    Examples: 
      | SheetName             |
      | Calendar_Create_valid |

  @TC_04_04_Modify/RepairCalendar
  Scenario Outline: To Modify Calendar
    Then User goes to GPS and open Calendar Modify menu
    Then User modify Calendar using "<SheetName>" and view the record

    Examples: 
      | SheetName       |
      | Calendar_Modify |

  @TC_05_05_ApproveCalendar
  Scenario Outline: To Approve Calendar
    Then User goes to GPS and open Calendar Approve menu to approve Calendar
    Then User Approves Calendar using "<SheetName>" and view the record

    Examples: 
      | SheetName             |
      | Calendar_Approve_View |
