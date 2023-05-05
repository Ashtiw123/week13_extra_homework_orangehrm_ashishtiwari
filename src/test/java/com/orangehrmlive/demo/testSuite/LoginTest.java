package com.orangehrmlive.demo.testSuite;

import com.orangehrmlive.demo.basetest.BaseTest;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully(){
    loginPage.setUsernameOption("Admin");
    loginPage.passwordOption("admin123");
    loginPage.clickLoginButton();
    String expectedMessage = "Dashboard";
    Assert.assertEquals(dashboardPage.getTextDashboard(),expectedMessage, "Dashboard");

    }





}
