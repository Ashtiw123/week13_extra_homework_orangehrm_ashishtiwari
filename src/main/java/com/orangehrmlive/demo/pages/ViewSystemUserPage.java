package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {
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
    By systemUsersTitle = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    public String verifySystemUsersText() {
        return getTextFromElement(systemUsersTitle);
    }


    By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public void enterUserName(String name){
        sendTextToElement(userName, name);
    }
    By userRoleDropDown = By.xpath("By userRoleDropDown = By.xpath(\"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]\" +" +
            "            \"/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]\");" +"    public void selectTheUserRoleDropdown() {" +
            "        clickOnElement(userRoleDropDown);" + "}");
    public void selectTheUserRoleDropdown() {
        clickOnElement(userRoleDropDown);
    }

    By employeeName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    public void enterEmployeeName(String name){
        sendTextToElement(employeeName, name);
    }

    By adminOption = By.cssSelector("//div[@class='oxd-select-text-input'][normalize-space()='Admin']");
    public void selectTheAdminOptionInUserRoleDropdown() {
        clickOnElement(adminOption);
    }
    By statusDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]" +
            "/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
        public void selectStatus(String status) {
        selectByVisibleTextFromDropDown(statusDropDown, status);
    }
    By searchButton = By.xpath("//button[normalize-space()='Search']");
        public void clickOnSearchButton(){
            clickOnElement(searchButton);
        }
    By userInList = By.xpath("//div[@class='oxd-table-card']//div[@role='row']");
    public String verifyUserInSearchResult() {
        return getTextFromElement(userInList);
    }

}
