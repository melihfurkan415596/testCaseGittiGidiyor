package page;

import base.BasePage;

public class LoginPage extends BasePage {
    public void beLogin(String mail,String password){
        sendKeysElementById("L-UserNameField",mail);
        sendKeysElementById("L-PasswordField",password);
        clickElementById("gg-login-enter");

    }
    public void goLogin(){
      hoverToElementByXpath("//div[@title='Giriş Yap']/div[@class='gekhq4-4 egoSnI']");
      clickElementByXpath("//a[contains(@href,'gittigidiyor.com/uye')]");
    }
    public void controlLogin(String xpathUserName){
        hoverToElementByXpath(xpathUserName);
    }

}
