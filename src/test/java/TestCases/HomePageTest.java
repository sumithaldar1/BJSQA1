package TestCases;

import Base.BaseClass;
import Pages.AddtoCartValidationModal;
import Pages.CartPage;
import Pages.HomePage;
import Pages.PDP;
import TestUtil.TestUtili;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends BaseClass {

    HomePage hm;
    PDP pdp;
    BaseClass bs;
    AddtoCartValidationModal mod;
    CartPage cp;

    public HomePageTest() {
        super();
    }

    @BeforeTest
    public void setup() {
        Start();
        hm = new HomePage();
        bs=new BaseClass();
        pdp= new PDP();
        mod= new AddtoCartValidationModal();
        cp= new CartPage();
    }

    @Test(priority = 1)
    public void validatetitle() {
        String title = hm.Pagetitle();
        Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }
    @Test(priority = 6)
    @Severity(SeverityLevel.NORMAL)
    @Description("Filling up BJS Optical PDP")
    @Story("Story Name: To validate adding of item to Cart")
    public void scrolling() {


        pdp.fillingup();
        mod=pdp.getpage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cp=mod.getpage();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    @Test(priority = 2)
    public void validatelogo() {
        boolean flag = hm.validateHeader();
        Assert.assertTrue(flag);

    }

    @Test(priority = 3)
    public void LoginTest() {
        pdp = hm.FInd(TestUtili.keyword);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void teardw() {
        driver.quit();
    }
}
