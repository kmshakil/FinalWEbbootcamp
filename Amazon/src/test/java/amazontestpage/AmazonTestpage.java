package amazontestpage;

import amazonhomepage.AmazonHomepage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class AmazonTestpage extends CommonAPI {
    AmazonHomepage homepagee;
    String url ="https://www.amazon.com/";


    @BeforeMethod
    public void init(){

        homepagee= PageFactory.initElements(driver,AmazonHomepage.class);
        driver.get(url);
    }

    @AfterMethod
    public void getback(){
        driver.navigate().to(url);
    }


   // @Test(enabled = true)
    public void account(){
        homepagee.setgotosigninpage("shakil", "shakil");
        sleepFor(5);
    }

   // @Test (enabled = true)
    public void clickOnOrders(){
        homepagee.setOrders();
        sleepFor(5);
    }


}
