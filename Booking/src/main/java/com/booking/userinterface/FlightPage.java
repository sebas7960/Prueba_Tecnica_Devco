package com.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightPage {

    public static final Target FLIGHT_TYPE_MENU = Target.the("display flight type options")
            .located(By.xpath("//div[@class='col-switch _iXn']"));
    public static final Target FLIGHT_TYPE_MODE_OPTION = Target.the("select flight type or mode")
            .locatedBy("//li[contains(text(), '{0}')]");
    public static final Target PEOPLE_NUMBER_MENU = Target.the("display people number options")
            .located(By.xpath("//div[@class='col-travelers _iXn _h-- _iaA _iq- _iY1']/div"));
    public static final Target ADULT_NUMBER = Target.the("adult number")
            .located(By.xpath("(//input[@type='text'])[18]"));
    public static final Target STUDENT_NUMBER = Target.the("student number")
            .located(By.xpath("(//input[@type='text'])[19]"));
    public static final Target ADD_ADULT_NUMBER = Target.the("add adult number")
            .located(By.xpath("(//button[@type='button'])[12]"));
    public static final Target ADD_STUDENT_NUMBER = Target.the("add student number")
            .located(By.xpath("(//button[@type='button'])[14]"));
    public static final Target FLIGHT_MODE_MENU = Target.the("display flight mode options")
            .located(By.xpath("//div[@class='col-cabin _iXn']"));
    public static final Target TITLE_H1 = Target.the("title text")
            .located(By.xpath("//h1"));
    public static final Target FROM_PLACE_MENU = Target.the("display from travel place")
            .located(By.xpath("(//div[@class='_ibT _id7'])[1]/div"));
    public static final Target FROM_PLACE_INPUT = Target.the("select from travel place")
            .located(By.xpath("(//input[@type='text'])[8]"));
    public static final Target FROM_PLACE_SELECT = Target.the("option result from travel place")
            .located(By.xpath("(//div[@role='dialog'])[2]/ul[2]"));
    public static final Target TO_PLACE_MENU = Target.the("display to travel place")
            .located(By.xpath("(//div[@class='_ibT _id7'])[2]/div"));
    public static final Target TO_PLACE_INPUT = Target.the("select to travel place")
            .located(By.xpath("(//input[@type='text'])[9]"));
    public static final Target TO_PLACE_SELECT = Target.the("option result to travel place")
            .located(By.xpath("(//div[@role='dialog'])[3]/ul[2]/li"));
    public static final Target DATE_DEPART_PLACE_MENU = Target.the("select from travel place")
            .located(By.xpath("(//div[@class='_iaf _iEU _iam _iai'])[1]/div/div[1]"));
    public static final Target NEXT_MONTH_DIV = Target.the("next month")
            .located(By.xpath("//div[@id='stl-jam-cal-nextMonth']"));
    public static final Target CHECK_IN_MON_YEAR_DIV = Target.the("check in month and year")
            .located(By.xpath("(//div[@class='_ijM _iAr _iaB _idE _iXr'])[2]"));
    public static final Target CHECK_IN_DAY_TABLE = Target.the("check in day")
            .locatedBy("(//div[@class='month '])[2]//div[text()='{0}']");
    public static final Target CHECK_OUT_MON_YEAR_DIV = Target.the("check out month and year")
            .located(By.xpath("(//div[@class='_ijM _iAr _iaB _idE _iXr'])[3]"));
    public static final Target CHECK_OUT_DAY_TABLE = Target.the("check out day")
            .locatedBy("(//div[@class='month '])[3]//div[text()='{0}']");
    public static final Target NO_FOUND_FLIGHT_MESSAGE = Target.the("message for no found flight")
            .locatedBy("//div[@class='col col-banner center']");

}
