@orangeHRM
Feature: orangeHrm website

@tc_01_Login
Scenario Outline: validate the login functionality
Given launch the browser and enter the url
When login page is opened
Then enter the "<username>" and "<password>"
Then click the login button
And take screenshot and close the browser



Examples:
|username   |password  |
|Admin       |admin123|
|admin       |Admin124|