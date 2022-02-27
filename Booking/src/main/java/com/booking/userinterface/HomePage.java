package com.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target FLIGHTS_MENU = Target.the("flights menu")
            .located(By.xpath("(//a[@class='bui-tab__link'])[1]"));
    public static final Target CAR_RENTAL_MENU = Target.the("car rental menu")
            .located(By.xpath("(//a[@class='bui-tab__link'])[2]"));
    public static final Target CONTINUE_BTN = Target.the("button to continue the action")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target TRAVEL_COMMUNITY_MENU = Target.the("travel community menu")
            .located(By.xpath("//li[@data-component='communities/entry-point']/a"));
    public static final Target PARTNER_HELP_MENU = Target.the("partner hub menu")
            .located(By.xpath("(//div[@class='footer-navigation-links-column'])[4]//li[4]/a"));


}