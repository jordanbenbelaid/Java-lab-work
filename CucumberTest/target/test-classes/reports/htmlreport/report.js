$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/task1.feature");
formatter.feature({
  "line": 1,
  "name": "Create User \u0026 Login",
  "description": "",
  "id": "create-user-\u0026-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Creating a user and logging in",
  "description": "",
  "id": "create-user-\u0026-login;creating-a-user-and-logging-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I can get to the add user page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "A \u003cusername\u003e and \u003cpassword\u003e is created",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "we input the \u003cusername\u003e and \u003cpassword\u003e into the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the login has been created",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "assert the login works",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "create-user-\u0026-login;creating-a-user-and-logging-in;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "create-user-\u0026-login;creating-a-user-and-logging-in;;1"
    },
    {
      "cells": [
        "jordan",
        "football"
      ],
      "line": 12,
      "id": "create-user-\u0026-login;creating-a-user-and-logging-in;;2"
    },
    {
      "cells": [
        "nancy",
        "tennis"
      ],
      "line": 13,
      "id": "create-user-\u0026-login;creating-a-user-and-logging-in;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2001084100,
  "status": "passed"
});
formatter.before({
  "duration": 1237925701,
  "status": "passed"
});
formatter.before({
  "duration": 1312291500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Creating a user and logging in",
  "description": "",
  "id": "create-user-\u0026-login;creating-a-user-and-logging-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I can get to the add user page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "A jordan and football is created",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "we input the jordan and football into the fields",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the login has been created",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "assert the login works",
  "keyword": "Then "
});
formatter.match({
  "location": "Task1.i_can_get_to_the_add_user_page()"
});
formatter.result({
  "duration": 635467300,
  "status": "passed"
});
formatter.match({
  "location": "Task1.a_jordan_and_football_is_created()"
});
formatter.result({
  "duration": 52100,
  "status": "passed"
});
formatter.match({
  "location": "Task1.we_input_the_jordan_and_football_into_the_fields()"
});
formatter.result({
  "duration": 51554600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".username\"}\n  (Session info: chrome\u003d89.0.4389.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-AI4SI4E\u0027, ip: \u0027192.168.0.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59947}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 804580f1876875a4d45f1724b531061a\n*** Element info: {Using\u003dclass name, value\u003dusername}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdefs.Task1.we_input_the_jordan_and_football_into_the_fields(Task1.java:56)\r\n\tat ✽.When we input the jordan and football into the fields(src/test/resources/cuke/task1.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Task1.i_verify_that_the_login_has_been_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task1.assert_the_login_works()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 750101801,
  "status": "passed"
});
formatter.after({
  "duration": 595191400,
  "status": "passed"
});
formatter.after({
  "duration": 674208700,
  "status": "passed"
});
formatter.before({
  "duration": 1307401400,
  "status": "passed"
});
formatter.before({
  "duration": 1486369800,
  "status": "passed"
});
formatter.before({
  "duration": 1309190601,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Creating a user and logging in",
  "description": "",
  "id": "create-user-\u0026-login;creating-a-user-and-logging-in;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I can get to the add user page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "A nancy and tennis is created",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "we input the nancy and tennis into the fields",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the login has been created",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "assert the login works",
  "keyword": "Then "
});
formatter.match({
  "location": "Task1.i_can_get_to_the_add_user_page()"
});
formatter.result({
  "duration": 362225000,
  "status": "passed"
});
formatter.match({
  "location": "Task1.a_nancy_and_tennis_is_created()"
});
formatter.result({
  "duration": 34800,
  "status": "passed"
});
formatter.match({
  "location": "Task1.we_input_the_nancy_and_tennis_into_the_fields()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.match({
  "location": "Task1.i_verify_that_the_login_has_been_created()"
});
formatter.result({
  "duration": 44800,
  "status": "passed"
});
formatter.match({
  "location": "Task1.assert_the_login_works()"
});
formatter.result({
  "duration": 138700,
  "status": "passed"
});
formatter.after({
  "duration": 724991499,
  "status": "passed"
});
formatter.after({
  "duration": 620412000,
  "status": "passed"
});
formatter.after({
  "duration": 687803699,
  "status": "passed"
});
});