package Base;

import TestUtil.TestUtili;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public static Actions actions;

    public BaseClass(){

        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream("P:\\Users\\shalder1\\IdeaProjects\\TestingBJS\\src\\main\\java\\Properties\\config.properties");
            prop.load(ip);
            this.actions=actions;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void Start()
    {
        String browsername = prop.getProperty("browser");
        if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","P:\\Users\\shalder1\\IdeaProjects\\TestingBJS\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtili.PageLoad, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtili.Imp, TimeUnit.SECONDS);
        //driver.get(prop.getProperty("url"));
        driver.get(TestUtili.url);

    }


}
