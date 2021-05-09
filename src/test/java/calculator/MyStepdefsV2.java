package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefsV2 {
    private CalculatorV2 calculator;
    private int value1;
    private int value2;
    private char opt;
    private int result;

    @Before
    public void before() {
        calculator = new CalculatorV2();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), and the operand (.)$")
    public void twoInputValuesAndAndTheOperand(int arg0, int arg1, char arg3) {
        value1 = arg0;
        value2 = arg1;
        opt = arg3;
    }

    @When("^I do the calculation$")
    public void iDoTheCalculation() {
        result = calculator.calculator(value1, value2, opt);
        System.out.print(result);
    }

    @Then("^I expect the final result (-?\\d+)$")
    public void iExpectTheFinalResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
