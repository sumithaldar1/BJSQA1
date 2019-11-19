package Pages;

import Base.BaseClass;
import TestUtil.TestUtili;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {

    private final TestUtili util;

    public CartPage(){
        PageFactory.initElements(driver, this);

        util= new TestUtili();
    }
}
