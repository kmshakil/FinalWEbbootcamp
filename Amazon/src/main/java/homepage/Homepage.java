package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement gotoaccount;
   @FindBy(xpath = "//*[@id=\"nav-orders\"]/span[2]")
   WebElement orders;
   @FindBy(xpath = "//*[@id=\"ap_email\"]")
   WebElement email;
   @FindBy(xpath = "//*[@id=\"ap_password\"]")
   WebElement password;
   @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
   WebElement signin;



    public void setOrders(){

        orders.click();
    }
    public void setgotosigninpage(String username, String pass){
        gotoaccount.click();
       email.sendKeys(username);
       password.sendKeys(pass);
       signin.click();
       sleepFor(5);




    }


}
