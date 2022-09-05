package com.selenium.test.demoqa;

import com.selenium.test.BaseTest;
import com.selenium.test.practiceFormPage.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoQATest extends BaseTest {

    private DemoQAPage demoQAPage;
    private PracticeFormPage practiceFormPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setupPages(){
        this.demoQAPage = new DemoQAPage(driver);
        this.practiceFormPage = new PracticeFormPage(driver);
    }

    @Test
    public void FormsWorkflow(){
        System.out.println("\n ********** Results exercise 1 **********");
        demoQAPage.goTo();
        demoQAPage.getFormsComponent().FormsComponentClick();
        softAssert.assertEquals("https://demoqa.com/automation-practice-form",driver.getCurrentUrl(),"1) URL Incorrect after click Forms Button");

        System.out.println("\n ********** Results exercise 2 **********");
        practiceFormPage.getPracticeFormButton().clickFormButton();
        softAssert.assertEquals("https://demoqa.com/automation-practice-form",driver.getCurrentUrl(),"2) URL Incorrect after click Practice Form Button");



    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"Carlos Rafael Contreras"},
        };
    }
}
