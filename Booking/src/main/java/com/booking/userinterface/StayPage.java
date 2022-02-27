package com.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StayPage {

    public static final Target SEARCH_INPUT = Target.the("input to search what you want")
            .located(By.xpath("//input[@type='search']"));
    public static final Target CHECK_IN_OUT_DIV = Target.the("display check in out date menu")
            .located(By.xpath("//div[@data-mode='checkin']"));
    public static final Target NEXT_MONTH_DIV = Target.the("next month")
            .located(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']"));
    public static final Target CHECK_IN_MON_YEAR_DIV = Target.the("check in month and year")
            .located(By.xpath("(//div[@class='bui-calendar__month'])[1]"));
    public static final Target CHECK_IN_DAY_TABLE = Target.the("check in day")
            .locatedBy("(//table[@class='bui-calendar__dates'])[1]//span[text()='{0}']");
    public static final Target CHECK_OUT_MON_YEAR_DIV = Target.the("check out month and year")
            .located(By.xpath("(//div[@class='bui-calendar__month'])[2]"));
    public static final Target CHECK_OUT_DAY_TABLE = Target.the("check out day")
            .locatedBy("(//table[@class='bui-calendar__dates'])[2]//span[text()='{0}']");
    public static final Target PEOPLE_ROOM_LABEL = Target.the("display people and rooms menu")
            .located(By.xpath("//label[@id='xp__guests__toggle']"));
    public static final Target ADULTS_NUMBER_SPAN = Target.the("adults number")
            .located(By.xpath("(//span[@class='bui-stepper__display'])[1]"));
    public static final Target CHILDREN_NUMBER_SPAN = Target.the("children number")
            .located(By.xpath("(//span[@class='bui-stepper__display'])[2]"));
    public static final Target ROOMS_NUMBER_SPAN = Target.the("room number")
            .located(By.xpath("(//span[@class='bui-stepper__display'])[3]"));
    public static final Target SUBTRACT_ADULTS_BUTTON = Target.the("subtract adult number")
            .located(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__subtract-button '])[1]"));
    public static final Target ADD_ADULTS_BUTTON = Target.the("add adult number")
            .located(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[1]"));
    public static final Target SUBTRACT_CHILDREN_BUTTON = Target.the("subtract children number")
            .located(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__subtract-button '])[2]"));
    public static final Target ADD_CHILDREN_BUTTON = Target.the("add children number")
            .located(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[2]"));
    public static final Target AGE_CHILDREN_SLT = Target.the("age children selected")
            .locatedBy("(//div[@class='sb-group__children__field clearfix']/select)[{0}]");
    public static final Target SUBTRACT_ROOM_BUTTON = Target.the("subtract room number")
            .located(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__subtract-button '])[3]"));
    public static final Target ADD_ROOM_BUTTON = Target.the("add room number")
            .located(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[3]"));
    public static final Target RESULTS_LIST = Target.the("result stays list")
            .located(By.xpath("//div[@data-testid='property-card']"));


}