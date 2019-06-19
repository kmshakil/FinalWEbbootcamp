package testpage;

import base.CommonAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testpage extends CommonAPI {
    Homepage homepage;
    String url ="https://www.amazon.com/";


    @BeforeClass
    public void init(){

        homepage= PageFactory.initElements(driver,Homepage.class);
        driver.get(url);
    }

    @AfterMethod
    public void getback(){
        driver.getCurrentUrl();
    }


    @Test(enabled = true)
    public void account(){
        homepage.setgotosigninpage("shakil", "shakil");
        sleepFor(5);
    }

   // @Test (enabled = true)
    public void clickOnOrders(){
        homepage.setOrders();
        sleepFor(5);
    }

}
