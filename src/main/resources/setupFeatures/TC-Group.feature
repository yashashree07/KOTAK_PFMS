#Author: Yashashree Suryawanshi
@Version1.0 @Regression_Pack_Group_Menu
Feature: To Test The Functionality Of Group Menu

  @TC01_01_AddGroup
  Scenario Outline: To Create Group
    Given User goes to Administration and then Group Add menu
    Then User enters valid group details using "<SheetName>" and clicks on Ok button

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_02_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_03_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_04_Group_Modify/Repair
  Scenario Outline: To perform Modify/Repair action for Group
    Given Group goes to Administration and then User selects Modify/Repair menu
    Then Group provides valid record details for Modify/Repair operation using "<SheetName>"

    Examples: 
      | SheetName                    |
      | User_ModifyRepairApproveView |

  @TC01_05_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName                     |
      | Group_ModifyRepairApproveView |

  @TC01_06_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName                     |
      | Group_ModifyRepairApproveView |

  @TC01_07_RemoveGroup
  Scenario Outline: To Remove Group
    Given User goes to Administration and then User selects Group Remove menu
    Then User goes to Remove screen and removes the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_RemoveApproveView |


  @TC01_08_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_09_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_10_BlockGroup
  Scenario Outline: To Block Group
    Given User goes to Administration and then User selcts Group Block menu
    Then User goes to Block screen and Block the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | Group_BlockApproveView |

 
  @TC01_11_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_12_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |
 
 @TC01_13_BlockGroup
  Scenario Outline: To Unblock Group
    Given User goes to Administration and then User selcts Group Block menu
    Then User goes to Block screen and Block the record using "<SheetName>"

    Examples: 
      | SheetName                |
      | Group_UnblockApproveView |

 
  @TC01_14_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

   Examples: 
      | SheetName                |
      | Group_UnblockApproveView |

  @TC01_15_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

  Examples: 
      | SheetName                |
      | Group_UnblockApproveView |
     