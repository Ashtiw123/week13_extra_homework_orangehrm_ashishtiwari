package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By systemUsersTitle = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    public String verifySystemUsersText() {
        return getTextFromElement(systemUsersTitle);
    }

    By addButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    By addUserTitle = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]");
    public String verifyAddUserText() {
        return getTextFromElement(addUserTitle);
    }
    By userRoleDropDown = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
    public void selectTheUserRoleDropdown() {
        clickOnElement(userRoleDropDown);
    }

    By adminOption = By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-" +
            "background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-" +
            "grid-2.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-" +
            "group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper div.oxd-select-text.oxd-" +
            "select-text--active > div.oxd-select-text-input");
    public void selectTheAdminOptionInUserRoleDropdown() {
        clickOnElement(adminOption);
    }

    By employeeName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]" +
            "/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public void enterEmployeeName(String name){
        sendTextToElement(employeeName, name);
    }

    By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    public void enterUserName(String name1){
        sendTextToElement(employeeName, name1);
    }

    By statusDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]" +
            "/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    public void selectStatus(String status) {
        selectByVisibleTextFromDropDown(statusDropDown, status);
    }

    By passwordText = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]" +
            "/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public void enterPasswordInPasswordField(String password){
        sendTextToElement(passwordText, password);
    }

    By confirmPasswordText = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]" +
            "/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    public void enterConfirmPasswordInPasswordField(String confirmPassword){
        sendTextToElement(passwordText, confirmPassword);
    }

    By saveButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]");
    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }
    By successfullySavedTitle = By.xpath("//div[@id='app']");
    public String verifySuccessfullySavedText() {
        return getTextFromElement(successfullySavedTitle);
    }
    By searchText = By.xpath("//button[@type='submit']");
    public void clickOnSearchButton(){
        clickOnElement(searchText);
            }
}
