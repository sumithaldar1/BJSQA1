package Pages;

import Base.BaseClass;
import TestUtil.TestUtili;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchbox;

    By Cart= By.xpath("//img[@class='img-responsive cart-icon cursor']");

    By search= By.xpath("//input[@placeholder='Search for contact lenses']");

    By logo= By.xpath("//img[@class='image']");

    By section=By.xpath("//*[@id=\"navFooter\"]/div[4]/ul/li[8]/a");

    By prescr= By.xpath("//*[@id=\"dFirstName\"]");
    private TestUtili util;


    public HomePage() {
        PageFactory.initElements(driver, this);

        util= new TestUtili();
    }



    public String Pagetitle() {
        return driver.getTitle();
    }

    public boolean validateHeader() {

        boolean flag;

        boolean logo1=driver.findElement(logo).isDisplayed();
        boolean search1=driver.findElement(search).isDisplayed();
        boolean cart1=driver.findElement(Cart).isDisplayed();
        if((cart1)&&(search1)&&(logo1)){
            flag=true;
        }
        else
        {
            flag=false;
        }
        return flag;

    }


    public PDP FInd(String key) {
        searchbox.sendKeys(key);
       // search.click();
        return new PDP();
    }


}
