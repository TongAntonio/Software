
public class CalculatorTest {

    private int numErrors = 0;

    public String n = "";

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result == 60) {
            System.out.println("Pass: " + result);
        }
    }

    public void testSubtract(){
        Calculator calculator = new Calculator();
        double result = calculator.subtract(50,10);
        if(result == 40){
            System.out.println("Pass: " + result);
        }
    }

    public void testMultiply(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(10,50);
        if(result == 500){
            System.out.println("Pass: " + result);
        }
    }
    public void testDivide(){
        Calculator calculator = new Calculator();
        double result = calculator.divide(100,50);
        if(result == 2){
            System.out.println("Pass: " + result);
        }
    }

    public static void main(String[] args){
              /* Calculator calculator = new Calculator();
              double result = calculator.add(10,50);
              if(result == 60)
                  System.out.println("Pass: " + result);
              else
                  System.out.println("Fail : Bad result = " + result); */

              CalculatorTest test = new CalculatorTest();
              try{
                  test.testAdd();
                  test.testSubtract();
                  test.testMultiply();
                  test.testDivide();
              }catch(Throwable e){
                  test.numErrors++;
                  System.err.println(e.getMessage());
              }

              if(test.numErrors > 0){
                  throw new IllegalStateException("There were " + test.n + "error(S)");
              }
    }

}
