package com.booking.runners.manual;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features= {"src/test/resources/features/manual/contact_customer_service.feature"},
        glue="com.booking.stepdefinitions.manual",
        snippets = CAMELCASE)
public class ContactCustomerServiceRunner {
}
