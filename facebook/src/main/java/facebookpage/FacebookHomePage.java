package facebookpage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookHomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement enail;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"u_0_2\"]")
    WebElement signin;

    public void setSignin(String username, String pass){
        enail.sendKeys(username);
        password.sendKeys(pass);
        signin.click();
    }
}
