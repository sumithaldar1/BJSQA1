package Pages;

import Base.BaseClass;
import TestUtil.TestUtili;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartValidationModal extends BaseClass {

    private final TestUtili util;
    CartPage cp;

    By validateadd= By.xpath("//button[contains(@class,'cart-btn')]");

    public AddtoCartValidationModal(){
        PageFactory.initElements(driver, this);

        this.util = new TestUtili();
        cp= new CartPage();
    }

    public CartPage getpage(){

        util.doClick(validateadd);
        return new CartPage();
    }
}
