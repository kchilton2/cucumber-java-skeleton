package io.cucumber.shouty;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    Person lucy;
    Person sean;

    String messageFromSean;

    @Given("Lucy is located {int} meters from Sean")
    public void lucyIsLocatedMetersFromSean(int distance) {
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
    }

    @When("Sean shouts {string}")
    public void seanShouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("Lucy hears Sean's message")
    public void lucyHearsSeanSMessage() {
        assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
    }
}