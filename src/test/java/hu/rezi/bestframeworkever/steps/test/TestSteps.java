package hu.rezi.bestframeworkever;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TestSteps {
    @Given("I open the browser")
    public static void iOpenTheBrowser() {
        System.out.println("OPENED");
    }

  @When("I navigate to {string}")
  public static void iNavigateToGoogle(String link) {
        System.out.println("NAVIGATED to " + link);
    }
    @Then("I see the search bar")
    public static void thenSearchBarDisplayed() {
    System.out.println("displayed");
    }
}
