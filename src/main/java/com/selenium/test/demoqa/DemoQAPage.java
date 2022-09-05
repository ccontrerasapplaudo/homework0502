package com.selenium.test.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoQAPage {
    private WebDriver driver;

    private FormsComponent formsComponent;

    public DemoQAPage(final WebDriver driver) {
        this.driver = driver;
        this.formsComponent = PageFactory.initElements(driver, FormsComponent.class);
    }

    public void goTo(){
        this.driver.get("https://demoqa.com/");
    }

    public FormsComponent getFormsComponent() {
        return formsComponent;
    }
}

