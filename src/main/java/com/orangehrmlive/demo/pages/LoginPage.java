package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
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


}
