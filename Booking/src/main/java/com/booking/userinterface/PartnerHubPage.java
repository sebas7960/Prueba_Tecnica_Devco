package com.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PartnerHubPage {

    public static final Target SEARCH_POST = Target.the("search a helper post")
            .located(By.xpath("//input[@placeholder='Search']"));
    public static final Target LIST_POST = Target.the("list of post about the search")
            .locatedBy("//a[text()='{0}']");
    public static final Target DESCRIPTION_OF_POST = Target.the("description from the post selected")
            .located(By.xpath("//section[@class='node__content']//p"));


}
