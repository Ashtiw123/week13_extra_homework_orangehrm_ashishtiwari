package com.orangehrmlive.demo.testSuite;

import com.orangehrmlive.demo.basetest.BaseTest;
import com.orangehrmlive.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    HomePage homePage = new HomePage();


    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.setUsernameOption("Admin");
        loginPage.passwordOption("admin123");
        loginPage.clickLoginButton();
        String expectedMessage = "Dashboard";
        Assert.assertEquals(dashboardPage.getTextDashboard(), expectedMessage, "Dashboard");
        dashboardPage.clickOnAdminTab();
        String expectedMessage1 = "System Users";
        Assert.assertEquals(addUserPage.verifySystemUsersText(), expectedMessage1, "System User text not displayed");
        addUserPage.clickOnAddButton();
        String expectedMessage2 = "Add User";
        Assert.assertEquals(addUserPage.verifyAddUserText(), expectedMessage2, "Add user text not displayed");
        Thread.sleep(2000);
        addUserPage.selectTheUserRoleDropdown();
        addUserPage.selectTheAdminOptionInUserRoleDropdown();
        addUserPage.enterEmployeeName("John Smith");
        addUserPage.enterUserName("John Smith1.");
        addUserPage.selectStatus("Disabled");
        addUserPage.enterPasswordInPasswordField("JohnSmith1.");
        addUserPage.enterConfirmPasswordInPasswordField("JohnSmith1.");
        addUserPage.clickOnSaveButton();
        String expectedMessage3 = "Successfully Saved";
        Assert.assertEquals(addUserPage.verifySuccessfullySavedText(), expectedMessage3, "Successfully Saved text not displayed");

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        viewSystemUserPage.setUsernameOption("Admin");
        viewSystemUserPage.passwordOption("admin123");
        viewSystemUserPage.clickLoginButton();
        String expectedMessage = "System Users";
        Assert.assertEquals(viewSystemUserPage.verifySystemUsersText(), expectedMessage, "System User text not displayed");
        viewSystemUserPage.enterUserName("John Smith1.");
        viewSystemUserPage.selectTheUserRoleDropdown();
        viewSystemUserPage.selectTheAdminOptionInUserRoleDropdown();
        viewSystemUserPage.enterEmployeeName("John Smith1");
        viewSystemUserPage.selectStatus("Disabled");
        viewSystemUserPage.clickOnSearchButton();
        String expectedMessage1 = "John Smith1";
        Assert.assertEquals(viewSystemUserPage.verifyUserInSearchResult(), expectedMessage1, "User John Smith 1 not found");
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        adminPage.setUsernameOption("Admin");
        adminPage.passwordOption("admin123");
        adminPage.clickLoginButton();
        String expectedMessage = "System Users";
        Assert.assertEquals(adminPage.verifySystemUsersText(), expectedMessage, "System User text not displayed");
        adminPage.enterUserName("John Smith1.");
        adminPage.selectTheUserRoleDropdown();
        adminPage.selectTheAdminOptionInUserRoleDropdown();
        adminPage.enterEmployeeName("John Smith1");
        adminPage.selectStatus("Disabled");
        adminPage.clickOnSearchButton();
        String expectedMessage1 = "John Smith1";
        Assert.assertEquals(adminPage.verifyUserInSearchResult(), expectedMessage1, "User John Smith 1 not found");
        adminPage.clickOnCheckBoxButton();
        adminPage.clickOnDeleteButton();
        adminPage.clickOnYesDeleteButton();
        String expectedMessage2 = "Successfully Deleted";
        Assert.assertEquals(adminPage.verifyUserInSearchResult(), expectedMessage2, "User not Deleted");
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        homePage.setUsernameOption("Admin");
        homePage.passwordOption("admin123");
        homePage.clickLoginButton();
        String expectedMessage = "System Users";
        Assert.assertEquals(homePage.verifySystemUsersText(), expectedMessage, "System User text not displayed");
        homePage.enterUserName("John Smith1.");
        homePage.selectTheUserRoleDropdown();
        homePage.selectTheUserRoleDropdown();
        homePage.clickOnSearchButton();
        homePage.verifyUserNotFoundText();


    }
}
