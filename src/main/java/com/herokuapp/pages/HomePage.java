package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[.='JavaScript Alerts']")
    WebElement alertLink;


    public AlertsPage getAlerts() {
        click(alertLink);
        return new AlertsPage(driver);
    }


    @FindBy(xpath="//a[.='Multiple Windows']")
    WebElement windowLink;
    public WindowPage getNewWindow() {
        click(windowLink);
        return new WindowPage(driver);
    }

    @FindBy(css = "div.row:nth-child(2) div.large-12.columns:nth-child(2) "
            + "ul:nth-child(4) li:nth-child(11) > a:nth-child(1)")
    WebElement selectOption;

    public SelectDropdownPage getSelectDropdown() {
        click(selectOption);
        return new SelectDropdownPage(driver);
    }
}
