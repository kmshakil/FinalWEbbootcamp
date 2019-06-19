package facebooktest;

import base.CommonAPI;
import facebookpage.FacebookHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebooktest extends CommonAPI {
    FacebookHomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, FacebookHomePage.class);

    }
    @Test
    public void account(){
        homePage.setSignin("kmshakil98", "kkkk");
        sleepFor(5);
    }
}