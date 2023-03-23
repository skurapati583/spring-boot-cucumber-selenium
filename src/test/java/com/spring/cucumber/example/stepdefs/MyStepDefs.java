package com.spring.cucumber.example.stepdefs;

import io.cucumber.java8.En;

public class MyStepDefs implements En {

    public MyStepDefs() {

        Given("User launches Internet Heroku App", () -> {

        });

        Then("User verifies heading as {string}", (String heading) -> {

        });

        Then("User verifies sub-heading as {string}", (String subHeading) -> {

        });

        When("User clicks on {string} link", (String linkText) -> {

        });

        When("User clicks on {string} button", (String buttonText) -> {

        });

        When("User enters valid username and password", () -> {

        });

        When("User enters invalid username and password", () -> {

        });

        Then("User verifies alert message as {string}", (String message) -> {

        });


    }
}
