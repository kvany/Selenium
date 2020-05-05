@orangeHRM
Feature: OrangeHrm website

@tc_01_recruitmentpage
Scenario: Click on search on recruitment page

Given Launch orangehrm application and login
When select Recruitment tab
Then select job title
Then select status	
Then Enter candidate name
Then Enter keywords
Then Select  method of application
Then Click Sreach button
Then Take screenshot  and quit application

