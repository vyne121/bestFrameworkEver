package hu.rezi.bestframeworkever.steps.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.fail;

@Component
public class TestSteps {
  private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getName());

  @Given("I open the browser")
  public static void iOpenTheBrowser() {
    System.out.println("OPENED");
    LOGGER.info("Opened the browser");
  }

  @When("I navigate to {string}")
  public static void iNavigateToGoogle(String link) {
    System.out.println("NAVIGATED to " + link);
    LOGGER.info("Navigated to " + link);
  }

  @Then("I see the search bar")
  public static void thenSearchBarDisplayed() {
    System.out.println("displayed");
    LOGGER.info("Displayed");
  }

  @Then("I see my Facebook friends")
  public void iSeeMyFacebookFriends() {
    LOGGER.error("Something went wrong");
    fail();
  }

  @Given("I throw an exception")
  public void iThrowAnException() {
    LOGGER.error("Something went wrong");
    throw new IllegalArgumentException("This is a test!");
  }
}
