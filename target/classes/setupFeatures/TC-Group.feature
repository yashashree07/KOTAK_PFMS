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

  @TC01_04_AddGroup_InvalidData
  Scenario Outline: To Create Group With Invalid Data
    Given User goes to Administration and then Group Add menu
    Then User enters invalid group details using "<SheetName>" and clicks on Ok button

    Examples: 
      | SheetName               |
      | Group_CreateInvalidData |

  @TC01_05_Group_Modify/Repair
  Scenario Outline: To perform Modify/Repair action for Group
    Given Group goes to Administration and then User selects Modify/Repair menu
    Then Group provides valid record details for Modify/Repair operation using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_ModifyApproveView |

  @TC01_06_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_ModifyApproveView |

  @TC01_07_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_ModifyApproveView |

  @TC01_08_Group_Modify/Repair_InvalidData
  Scenario Outline: To perform Modify/Repair action for Group Menu With Invalid Data
    Given Group goes to Administration and then User selects Modify/Repair menu
    Then Group provides invalid record details for Modify/Repair operation using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_ModifyInvalidData |

  @TC01_09_RemoveGroup
  Scenario Outline: To Remove Group
    Given User goes to Administration and then User selects Group Remove menu
    Then User goes to Remove screen and removes the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_RemoveApproveView |

  @TC01_10_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_RemoveApproveView |

  @TC01_11_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_RemoveApproveView |

  @TC01_12_BlockGroup
  Scenario Outline: To Block Group
    Given User goes to Administration and then User selects Group Block menu
    Then User goes to Block screen and Block the record using "<SheetName>"

    Examples: 
      | SheetName              |
      | Group_BlockApproveView |

  @TC01_13_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_14_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName               |
      | Group_CreateApproveView |

  @TC01_15_UnBlockGroup
  Scenario Outline: To Unblock Group
    Given User goes to Administration and then User selects Group UnBlock menu
    Then User goes to UnBlock screen and Block the record using "<SheetName>"

    Examples: 
      | SheetName                |
      | Group_UnblockApproveView |

  @TC01_16_Approve_Group
  Scenario Outline: To Approve the Group
    Given User goes to Administration and then Group Approve menu
    Then User goes to Group Approve screen and approves the record using "<SheetName>"

    Examples: 
      | SheetName                |
      | Group_UnblockApproveView |

  @TC01_17_View_Group
  Scenario Outline: To View the Group
    Given User goes to Administration and then Group List menu
    Then User goes to Group List screen and views the record using "<SheetName>"

    Examples: 
      | SheetName                |
      | Group_UnblockApproveView |
