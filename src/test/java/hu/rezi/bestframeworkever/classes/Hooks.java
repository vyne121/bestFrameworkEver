package hu.rezi.bestframeworkever;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

  @Before
  public static void setUp() {
    System.out.println("BEFORE");
  }

  @After
  public static void tearDown(Scenario scenario) {
    System.out.println("TEARDOWN");
  }
}
