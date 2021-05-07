package tests;

import base.BaseTest;
import org.junit.Test;
import page.BasketPage;
import page.HomePage;
import page.LoginPage;
import page.ProductPage;

public class TestCaseGittiGidiyor extends BaseTest {
    @Test
    public void startTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage() ;
        ProductPage productPage = new ProductPage() ;
        BasketPage basketPage = new BasketPage() ;
        loginPage.goLogin();
        loginPage.beLogin("melihfurkan96@hotmail.com","Melih.4196");
        loginPage.controlLogin("//span[contains(text(),'melihtore518435')]");
        homePage.searchProduct("bilgisayar");
        homePage.goToSecondPage();
        homePage.controlSecondPageUrl();
        homePage.selectRandomProduct("//a[contains(@class,'product-link')]");
        productPage.comparePrice();
        basketPage.productIncrease();
        basketPage.checkProductCount();
        basketPage.deleteProduct();
        basketPage.checkResult();
    }

}
