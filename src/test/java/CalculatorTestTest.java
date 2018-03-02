import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {

    @org.junit.jupiter.api.Test
    void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10,50);

        assertEquals(60,result);
    }

    @org.junit.jupiter.api.Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(50,10);

        assertEquals(40,result);
    }

    @org.junit.jupiter.api.Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(50,10);

        assertEquals(500,result);
    }

    @org.junit.jupiter.api.Test
    void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(500,10);

        assertEquals(50,result);
    }

    @org.junit.jupiter.api.Test
    void main() {
        testAdd();
        testSubtract();
        testMultiply();
        testDivide();
    }
}