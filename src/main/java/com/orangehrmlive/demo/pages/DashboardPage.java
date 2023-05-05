package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardLabel = By.xpath("//header/div[1]/div[1]");

    public String getTextDashboard() {
        return getTextFromElement(dashboardLabel);
    }

    By adminTab = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");

    public void clickOnAdminTab() {
        clickOnElement(adminTab);
    }


}
