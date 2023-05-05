package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By usernameOption = By.xpath("//input[@placeholder='Username']");
    public void setUsernameOption(String username) {
        sendTextToElement(usernameOption, username);
    }

    By passwordOption = By.xpath("//input[@placeholder='Password']");

    public void passwordOption(String password) {
        sendTextToElement(passwordOption, password);
    }

    By loginButton = By.xpath("//button[@type='submit']");

    public void clickLoginButton() {
        clickOnElement(loginButton);
    }
    By systemUsersTitle = By.xpath("//h5[normalize-space()='System Users']");

    public String verifySystemUsersText() {
        return getTextFromElement(systemUsersTitle);
    }
    By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public void enterUserName(String name) {
        sendTextToElement(userName, name);
    }
    By userRoleDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]" +
            "/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]");

    public void selectTheUserRoleDropdown() {
        clickOnElement(userRoleDropDown);
    }
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    By userNotFoundText = By.xpath("//div[@id='oxd-toaster_1']");

    public String verifyUserNotFoundText() {
        return getTextFromElement(userNotFoundText);
    }
}
