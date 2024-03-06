package hu.rezi.bestframeworkever.classes;

import hu.rezi.bestframeworkever.util.reporting.AttachmentUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assumptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {

  public static final String SKIPPED_TAG = "@skipped";

  private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getName());

  @Before
  @Step("Setup")
  public static void setUp(Scenario scenario) {

  }

  @Before("@skipped")
  public void skipScenario(Scenario scenario){
    Assumptions.assumeTrue(
            !scenario.getSourceTagNames().contains(SKIPPED_TAG),
            String.format("Skipping scenario: %s", scenario.getName()));
  }

  @AfterStep
  public void afterStep() {
    AttachmentUtil.attachScreenshot("Step Screenshot");
  }

  @After
  @Step("Teardown")
  public static void tearDown(Scenario scenario) {
    if (scenario.isFailed()) {
      AttachmentUtil.attachScreenshot(scenario.getName());
    }
    System.out.println("TEARDOWN");
  }
}
