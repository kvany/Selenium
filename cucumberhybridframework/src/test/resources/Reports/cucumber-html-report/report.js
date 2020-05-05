$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/KRISHNA PC/eclipse-workspace/cucumberhybridframework/src/test/resources/Features/Admin.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHrm website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Click on Admin page",
  "description": "",
  "id": "orangehrm-website;click-on-admin-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_adminpage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch orangehrm application and login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "select Admin tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select userrole",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter Employeename",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select  Status",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click Sreach button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Take pic",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "quit application",
  "keyword": "And "
});
formatter.match({
  "location": "orangehrmrecruitmentstep.launch_orangehrm_application_and_login()"
});
formatter.result({
  "duration": 12476604400,
  "status": "passed"
});
formatter.match({
  "location": "orangehrmadminstep.select_Admin_tab()"
});
formatter.result({
  "duration": 23221300,
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:85)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:45)\r\n\tat com.pages.HRM_Adminpages.clickadmin(HRM_Adminpages.java:35)\r\n\tat com.stepdefinition.orangehrmadminstep.select_Admin_tab(orangehrmadminstep.java:35)\r\n\tat ✽.When select Admin tab(C:/Users/KRISHNA PC/eclipse-workspace/cucumberhybridframework/src/test/resources/Features/Admin.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "orangehrmadminstep.enter_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "orangehrmadminstep.select_userrole()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "orangehrmadminstep.enter_Employeename()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "orangehrmadminstep.select_Status()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "orangehrmadminstep.click_Sreach_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "orangehrmadminstep.Take_pic()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "orangehrmadminstep.quit_application()"
});
formatter.result({
  "status": "skipped"
});
});