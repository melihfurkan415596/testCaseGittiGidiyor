package page;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public void comparePrice() {
        String productPrice = getTextById("sp-price-lowPrice");
        System.out.println("Ürün detayında bulunan fıyat =  " +productPrice);
        addBasket();
        hoverToElementByXpath("(//a[contains(@href,'gittigidiyor.com/sepetim')])[1]");
        clickElementByXpath("(//a[contains(@href,'gittigidiyor.com/sepetim')])[1]");
        String basketPrice = getTextByXpath("//div[@class='total-price']/strong");
        System.out.println("Sepet Fıyatı =  " +basketPrice);
        Assert.assertEquals(productPrice,basketPrice);
    }
    public void addBasket(){
        moveScrollToElement("//button[@id='add-to-basket']");
        clickElementByXpath("//button[@id='add-to-basket']");
    }
}
