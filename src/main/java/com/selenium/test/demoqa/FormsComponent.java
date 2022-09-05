package com.selenium.test.demoqa;

import com.selenium.test.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsComponent extends AbstractComponent {

    private WebDriver webDriver;

    @FindBy(css = "div.card.mt-4.top-card:nth-child(2)")
    private WebElement component;

    public FormsComponent(final WebDriver driver){
        super(driver);
        this.webDriver=driver;
    }

    public void FormsComponentClick(){
        component.click();
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
}
