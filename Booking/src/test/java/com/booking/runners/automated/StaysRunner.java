package com.booking.runners.automated;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features= {"src/test/resources/features/automated/stays.feature"},
        glue="com.booking.stepdefinitions.automated",
        tags = "",
        snippets = CAMELCASE)
public class StaysRunner {
}