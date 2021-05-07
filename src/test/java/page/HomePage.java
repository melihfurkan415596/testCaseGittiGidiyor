package page;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {
    public void searchProduct(String searchKey){
        sendKeysElementByXpath("//input[@placeholder='Keşfetmeye Bak']",searchKey);
        clickElementByXpath("//button[@data-cy='search-find-button']");
    }

    public void goToSecondPage() {
        moveScrollToElement("//div[@id='best-match-right']/div[5]/ul/li[2]/a");
        clickElementByXpath("//div[@id='best-match-right']/div[5]/ul/li[2]/a");
    }
    public void controlSecondPageUrl(){
        checkedUrl("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
    }

    public void selectRandomProduct(String xpath) {
        Random random=new Random();
        List<WebElement>products=findElementsByXpath(xpath);
        System.out.println("Sayfa üzerınde bulunan ürün sayısı = " + products.size());
        int randomNumber =random.nextInt(products.size());
        WebElement element = products.get(randomNumber);
        System.out.println("Rastgele seçılen ürün ındex =" + randomNumber);
        element.click();
    }


}
