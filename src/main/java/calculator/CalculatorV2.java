package calculator;
import java.lang.Math;

public class CalculatorV2 {
    private int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    private int divide(int a, int b) {
        return a / b;
    }

    public int calculator(int a, int b, char opt) {
        if (opt == '/') {
            return divide(a, b);
        } else {
            return power(a, b);
        }
    }
}
