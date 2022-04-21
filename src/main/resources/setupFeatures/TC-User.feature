#Author: Yashashree Suryawanshi
@Version1.0 @Regression_Pack_User_Menu
Feature: To Test The Functionality Of User Menu

  @TC01_01_AddUser 
  Scenario Outline: To Create User
    Given User goes to Administration and then User Add menu
    Then User enters details using "<SheetName>" and clicks on Ok button

    Examples: 
      | SheetName              |
      | User_CreateApproveView |

  @TC01_02_Approve_User
  Scenario Outline: To Approve the User
    Given User goes to Administration and then User Approve menu
    Then User goes to Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | User_CreateApproveView |

  @TC01_03_View_User
  Scenario Outline: To View the User
    Given User goes to Administration and then User List menu
    Then User goes to List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | User_CreateApproveView |

  @TC01_03_AddUser_InvalidData
  Scenario Outline: To Create User With Invalid Data
    Given User goes to Administration and then User Add menu
    Then User enters invalid details using "<SheetName>" and clicks on Ok button

    Examples: 
      | SheetName               |
      | User_Create_InvalidData |

  @TC01_04_User_Modify/Repair
  Scenario Outline: To perform Modify/Repair action for user
    Given User goes to Administration and then User selects Modify/Repair menu
    Then User provides valid record details for Modify/Repair operation using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_ModifyRepairApproveView |

 @TC01_05_Approve_User
  Scenario Outline: To Approve the User
    Given User goes to Administration and then User Approve menu
    Then User goes to Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_ModifyRepairApproveView |

  @TC01_06_View_User
  Scenario Outline: To View the User
    Given User goes to Administration and then User List menu
    Then User goes to List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_ModifyRepairApproveView |

 @TC01_07_User_Modify/Repair_InvalidData
  Scenario Outline: To perform Modify/Repair action for user With Invalid Data
    Given User goes to Administration and then User selects Modify/Repair menu
    Then User provides invalid record details for Modify/Repair operation using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_ModifyRepairInvalidData |

  @TC01_08_RemoveUser
  Scenario Outline: To Remove User
    Given User goes to Administration and then User selects Remove menu
    Then User goes to Remove screen and remove the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | User_RemoveApproveView |

  @TC01_09_Approve_User
  Scenario Outline: To Approve the User
    Given User goes to Administration and then User Approve menu
    Then User goes to Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | User_RemoveApproveView |

  @TC01_10_View_User
  Scenario Outline: To View the User
    Given User goes to Administration and then User List menu
    Then User goes to List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | User_RemoveApproveView |

  @TC01_11_BlockUnBlockUser
  Scenario Outline: To Block or UnBlock User
    Given User goes to Administration and then User selcts Block or UnBlock menu
    Then User goes to BlockUnblock screen and Block or UnBlock the record using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_BlockUnblockApproveView |

  @TC01_12_Approve_User
  Scenario Outline: To Approve the User
    Given User goes to Administration and then User Approve menu
    Then User goes to Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_BlockUnblockApproveView |

  @TC01_13_View_User
  Scenario Outline: To View the User
    Given User goes to Administration and then User List menu
    Then User goes to List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_BlockUnblockApproveView |
