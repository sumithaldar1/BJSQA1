package TestUtil;

import Base.BaseClass;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtili extends BaseClass {

    public static long PageLoad= 20;
    public static long Imp=10;
    public static String url="https://qa1-contacts.bjs.com/pdp?id=258046";
    public static String keyword="iphone";

    public static void scrolling(By locator) {
        JavascriptExecutor je = (JavascriptExecutor) driver;

        je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(locator));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Step("Selecting value from dropdown")
    public void secletionfromdropdown(By locator, int value) {
        Select drpdwn = new Select(driver.findElement(locator));
        drpdwn.selectByIndex(value);
        String s = driver.findElements(locator).toString();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Chosen value is " + s);
    }

    public String doGetText(By locator) {
        return driver.findElement(locator).getText();
    }


    @Step("Passing values to Fields")
    public void doSendKeys(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
       /** try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }**/
    }

    public void secletionfromdropdownusingtext(By locator, String value) {
        Select drpdwn = new Select(driver.findElement(locator));
        drpdwn.selectByVisibleText(value);
       /** try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }**/
        String s = drpdwn.getOptions().toString();
        System.out.println("Chosen value is " + s);
    }

    public boolean selectingcheckbox(By locator){
        WebElement d1 = driver.findElement(locator);
        d1.click();
        boolean f=d1.isSelected();
        return f;
    }

    public void doClick(By locator) {
        driver.findElement(locator).click();
    }

}
