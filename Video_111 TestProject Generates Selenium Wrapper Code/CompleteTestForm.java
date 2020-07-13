package io.testproject.completetestform;

import io.testproject.java.annotations.v2.Parameter;
import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.ParameterDirection;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;
import java.lang.String;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: TestProject Tutorial
 * Test: Complete Test Form
 * Generated by: Rex Jones II (Rex.Jones@Test4Success.org)
 * Generated on Wed Jul 08 01:03:29 GMT 2020.
 */
@Test(
    name = "Complete Test Form",
    description = "Complete TestProject Example Page Form",
    version = "1.0"
)
public class CompleteTestForm implements WebTest {
  @Parameter(
      description = "Auto generated application URL parameter",
      defaultValue = "https://example.testproject.io/web/",
      direction = ParameterDirection.INPUT
  )
  public String ApplicationURL;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    ExecutionResult executionresult;
    LoginTest logintest;

    // 1. Log Into TestProject Example Page
    //    Navigates the specified URL (Auto-generated)
    logintest = new LoginTest();
    logintest.ApplicationURL = "https://example.testproject.io/web/";
    executionresult = logintest.execute(helper);
    report.step("Log Into TestProject Example Page", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);

    // 2. Click 'country'
    by = By.cssSelector("#country");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'country'", booleanResult, TakeScreenshotConditionType.Never);

    // 3. Select the 'US' option in 'country'
    by = By.cssSelector("#country");
    booleanResult = driver.testproject().selectAnOptionByValue(by,"US");
    report.step("Select the 'US' option in 'country'", booleanResult, TakeScreenshotConditionType.Never);

    // 4. Click 'country'
    by = By.cssSelector("#country");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'country'", booleanResult, TakeScreenshotConditionType.Never);

    // 5. Type '1234 TestProject Avenue' in 'address'
    by = By.cssSelector("#address");
    booleanResult = driver.testproject().typeText(by,"1234 TestProject Avenue");
    report.step("Type '1234 TestProject Avenue' in 'address'", booleanResult, TakeScreenshotConditionType.Never);

    // 6. Type 'Rex.Jones@Test4Success.org' in 'email'
    by = By.cssSelector("#email");
    booleanResult = driver.testproject().typeText(by,"Rex.Jones@Test4Success.org");
    report.step("Type 'Rex.Jones@Test4Success.org' in 'email'", booleanResult, TakeScreenshotConditionType.Never);

    // 7. Type '214-225-1234' in 'phone'
    by = By.cssSelector("#phone");
    booleanResult = driver.testproject().typeText(by,"214-225-1234");
    report.step("Type '214-225-1234' in 'phone'", booleanResult, TakeScreenshotConditionType.Never);

    // 8. Click 'save'
    by = By.cssSelector("#save");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'save'", booleanResult, TakeScreenshotConditionType.Never);

    return ExecutionResult.PASSED;
  }
}