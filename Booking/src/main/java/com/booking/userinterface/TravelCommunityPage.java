package com.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TravelCommunityPage {

    public static final Target SEARCH_FOR_COUNTRY = Target.the("search country post")
            .located(By.xpath("(//input[@type='text'])[1]"));
    public static final Target SELECT_COUNTRY = Target.the("select country option")
            .locatedBy("//a[@data-title='{0}']");
    public static final Target SEARCH_POST = Target.the("search criteria post")
            .located(By.xpath("//input[@name='query']"));
    public static final Target SELECT_POST = Target.the("select the post")
            .locatedBy("(//div[@class='post-preview__clickable'])[1]");
    public static final Target DESCRIPTION_SELECTED_POST = Target.the("description of the post")
            .locatedBy("(//div[@class='post__content']//p)[2]");
}