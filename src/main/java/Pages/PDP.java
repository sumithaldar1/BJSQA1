package Pages;

import Base.BaseClass;
import TestUtil.TestUtili;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class PDP extends BaseClass {

    private final TestUtili util;

    By pdpzipcode =  By.id("detailZipCode");
    By updatezipcode= By.xpath("//div[@class='col-md-6 col-lg-8 desktoponly']//button[@class='btn btn-outline-secondary'][contains(text(),'UPDATE')]");
    By addtocart= By.xpath("//button[contains(@class,'btn btn-primary btn-addToCart')]");


    By prescr=By.xpath("//h6[@class='heading']");
    By righteyecheckbox=By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//span[@class='checkbox-checkmark']");
    //right eye parameters

    By right_bc= By.id("right_bc");
    By right_dia= By.id("right_dia");
    By right_power=By.id("right_power");
    By right_cyl= By.id("right_cyl");
    By right_axis= By.id("right_axis");
    By right_add= By.id("right_add");
    By right_dn= By.id("right_dn");

    By lefteyecheckbox=By.cssSelector("div.container-fluid.wrapper div.pdp-container div.row div.pdp-box.presc-box:nth-child(2) div.col-12 div.row div.col-lg-12.col-md-12.col-6:nth-child(3) form.ng-untouched.ng-pristine.ng-invalid div.row.justify-content.no-gutters div.col-lg-1.col-md-1.col-12.eye-conf:nth-child(1) label.checkbox-container > span.checkbox-checkmark");
    //left eye parameters

    By left_bc= By.id("left_bc");
    By left_dia= By.id("left_dia");
    By left_power=By.id("left_power");
    By left_cyl= By.id("left_cyl");
    By left_axis= By.id("left_axis");
    By left_add= By.id("left_add");
    By left_dn= By.id("left_dn");

    By drfname=By.xpath("//input[@id='dFirstName']");
    By drlname=By.xpath("//input[@id='dLastName']");
    By Add1=By.id("address1");
    By Add2=By.id("address2");
    By city=By.id("city_town");
    By stat=By.id("dState");
    By zipcode=By.id("dZipCode");
    By phone=By.id("dPhoneNumber");
    By pres_month= By.id("pMonth");
    By pres_date= By.id("pDate");
    By pres_year=By.id("pYear");
    By pname= By.id("pFirstName");
    By lname=By.id("pLastName");
    By dobmm=By.id("dobMM");
    By dobdd=By.id("dobDD");
    By dobyy= By.id("dobYY");


    public PDP(){
        PageFactory.initElements(driver, this);

        util= new TestUtili();
    }

    public void fillingup()
    {
        util.doSendKeys(pdpzipcode,"12345");
        util.doClick(updatezipcode);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        util.scrolling(prescr);
        util.selectingcheckbox(lefteyecheckbox);
        util.secletionfromdropdown(right_bc,0);
        util.secletionfromdropdown(right_add,1);
        util.secletionfromdropdown(right_axis,1);
        util.secletionfromdropdown(right_cyl,1);
        util.secletionfromdropdown(right_dia,0);
        util.secletionfromdropdown(right_power,1);
        util.secletionfromdropdown(right_dn,0);
        util.doSendKeys(drfname,"Walter");
        util.doSendKeys(drlname,"White");
        util.doSendKeys(Add1,"Hargrove Lane");
        util.doSendKeys(Add2,"Mexico");
        util.doSendKeys(city,"New Mexico");
        util.doSendKeys(zipcode,"12345");
        util.secletionfromdropdown(stat,4);
        util.doSendKeys(phone,"8017785868");
        util.secletionfromdropdownusingtext(pres_year,"2020");
        util.secletionfromdropdownusingtext(pres_month,"12");
        util.secletionfromdropdownusingtext(pres_date,"30");
        util.doSendKeys(pname,"Jesse");
        util.doSendKeys(lname,"Pinkman");
        util.secletionfromdropdownusingtext(dobyy,"1993");
        util.secletionfromdropdownusingtext(dobmm,"12");
        util.secletionfromdropdownusingtext(dobdd,"20");
    }

    public AddtoCartValidationModal getpage(){
        util.doClick(addtocart);
        return new AddtoCartValidationModal();

    }



}
