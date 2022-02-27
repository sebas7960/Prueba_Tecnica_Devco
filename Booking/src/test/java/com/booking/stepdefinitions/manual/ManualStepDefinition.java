package com.booking.stepdefinitions.manual;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

import static com.booking.utils.manual.cases.ManualTest.validate;

public class ManualStepDefinition {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @When("^(.*)$")
    public void stepDefinitions(String step) {
        validate(step, scenario.getName());
    }
}
