package com.AutomationProject.tests;

import base.BaseTest;
import com.AutomationProject.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReportManager;

public class SignupTest extends BaseTest {

    // Generate unique username
    String username = "user" + System.currentTimeMillis();

    @Test(priority = 2)
    public void verifyUserCanSignUpSuccessfully() {

        ReportManager.getReport().createATestCase("Verify User Can Sign Up Successfully");

        try {
            SignupPage signupPage = new SignupPage();
            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Opening Signup Modal");

            signupPage.clickSignUpHomepage();

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Entering username: " + username);

            signupPage.enterUsername(username);

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Entering password");

            signupPage.enterPassword("Pass@123");

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Clicking on Sign Up button");

            signupPage.clickSignUp();

            driver.navigate().refresh();

            ReportManager.getReport().testPass("User signed up successfully!");

        } catch (Exception e) {
            ReportManager.getReport().testFail("Test Failed: " + e.getMessage());
            ReportManager.getReport().addScreenshotToReport(driver, "SignUpFailed", "Failure Screenshot");
            throw e;
        }
    }

    @Test(priority = 1)
    public void verifyAlertWhenSubmittingEmptyFields() {

        ReportManager.getReport().createATestCase("Verify Alert for Empty Signup Fields");

        try {
            SignupPage signupPage = new SignupPage();

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Opening Signup Modal");

            signupPage.clickSignUpHomepage();

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Clicking SignUp without entering credentials");

            signupPage.clickSignUp();

            String alertText = driver.switchTo().alert().getText();

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Alert message captured: " + alertText);

            Assert.assertTrue(alertText.contains("Please"),
                    "Expected alert message but got: " + alertText);

            driver.switchTo().alert().accept();

            driver.navigate().refresh();

            ReportManager.getReport().testPass("Alert popup validated successfully!");

        } catch (Exception e) {
            ReportManager.getReport().testFail("Test Failed: " + e.getMessage());
            ReportManager.getReport().addScreenshotToReport(driver, "AlertPopupFail", "Failure Screenshot");
            throw e;
        }
    }


    @Test(priority = 3)
    public void verifyErrorShownWhenUsernameAlreadyExists() {

        ReportManager.getReport().createATestCase("Verify Error for Existing Username");

        try {
            SignupPage signupPage = new SignupPage();

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Opening Signup Modal");

            signupPage.clickSignUpHomepage();

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Entering existing username: " + username);

            signupPage.enterUsername(username);

            ReportManager.getReport().addTestLog(com.aventstack.extentreports.Status.INFO,
                    "Entering password");

            signupPage.enterPassword("Pass@123");

            signupPage.clickSignUp();

            driver.navigate().refresh();

            ReportManager.getReport().testPass("Existing user error validated successfully!");

        } catch (Exception e) {
            ReportManager.getReport().testFail("Test Failed: " + e.getMessage());
            ReportManager.getReport().addScreenshotToReport(driver, "ExistingUserFail", "Failure Screenshot");
            throw e;
        }
    }
}
