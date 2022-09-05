package com.selenium.test.practiceFormPage;

import com.selenium.test.demoqa.FormsComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {
    private WebDriver driver;

    private PracticeFormButton practiceFormButton;

    public PracticeFormPage(final WebDriver driver) {
        this.driver = driver;
        this.practiceFormButton = PageFactory.initElements(driver, PracticeFormButton.class);
    }

    public PracticeFormButton getPracticeFormButton() {
        return practiceFormButton;
    }
}
