package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver)
                .getNewWindow();
    }
    @Test
    public void switchToNewTabTest() {
        new WindowPage(driver)
                .switchToNewTab(1)
                .verifyNewTabTitle("New Window");
    }
}
