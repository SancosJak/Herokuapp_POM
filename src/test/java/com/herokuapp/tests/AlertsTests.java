package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {
    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getAlerts();
    }

    @Test
    public void acceptAlert() {
        new AlertsPage(driver).clickOnAlertButton()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }

    @Test
    public void confirmAlertTest() {
        new AlertsPage(driver).clickOnConfirmButton()
                .selectConfirm("Cancel")
                .verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("Hi Alert")
                .acceptAlert()
                .verifyResult("Hi Alert");
    }
}
