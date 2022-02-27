package com.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarRentalPage {

    public static final Target PICKUP_LOCATION_PLACE = Target.the("put the place where you go to pickup the car")
            .located(By.xpath("//input[@name='ss_origin']"));
    public static final Target PICKUP_LOCATION_SELECTED = Target.the("put the place where you go to pickup the car")
            .located(By.xpath("//ul[@class='c-autocomplete__list sb-autocomplete__list -visible']/li[1]"));
    public static final Target CHECK_IN_DATE_MENU = Target.the("display check in menu")
            .located(By.xpath("//div[@class='xp__dates-inner xp__dates__checkin']"));
    public static final Target CHECK_IN_MONTH_YEAR_TEXT = Target.the("check in month and year text")
            .locatedBy("(//th[@class='c2-month-header-monthname'])[{0}]");
    public static final Target CHECK_IN_DAY_NUMBER = Target.the("put the day for the check in")
            .locatedBy("((//table[@class='c2-month-table'])[{0}]//span)[{1}]");
    public static final Target CHECK_OUT_MONTH_YEAR_TEXT = Target.the("check out month and year text")
            .located(By.xpath("(//th[@class='c2-month-header-monthname'])[2]]"));
    public static final Target CHECK_OUT_DAY_NUMBER = Target.the("put the day for the check out")
            .locatedBy("((//table[@class='c2-month-table'])[2]//span)[1]]");
    public static final Target NEXT_MONTH_BTN = Target.the("button to move to the next month")
            .locatedBy("(//div[@class='c2-button c2-button-further'])[1]");
    public static final Target CAR_SIZE_TEXT = Target.the("select car size")
            .locatedBy("//ul[@class='SM_6d382568']//div[text()='{0}']");
    public static final Target CAR_RESULTS = Target.the("car results")
            .locatedBy("(//div[@class='SM_d10c8f3d SM_aa216a55 SM_6b38ebe2'])[3]//section");

}
