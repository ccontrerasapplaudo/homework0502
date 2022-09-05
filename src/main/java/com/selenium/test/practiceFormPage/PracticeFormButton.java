package com.selenium.test.practiceFormPage;

import com.selenium.test.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormButton extends AbstractComponent{

    @FindBy(xpath = "//li[@id=\"item-0\"]")
    WebElement component;

    WebDriver webDriver;

    public PracticeFormButton(final WebDriver driver){
        super(driver);
        this.webDriver=driver;
    }

    public void clickFormButton(){
        component.click();
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
}
