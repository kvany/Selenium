@orangeHRM
Feature: OrangeHrm website

@tc_01_adminpage
Scenario: Click on Admin page

Given Launch orangehrm application and login
When select Admin tab
Then Enter username
Then Select userrole
Then Enter Employeename
Then Select  Status
Then Click Sreach button
Then Take pic
And quit application

