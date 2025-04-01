package calculator;

/**
 * @author Nick Patrikeos
 **/
public class Calculator {
    public static void main(String[] args) {
        Node equation = new Add(
                new Value(1),
                new Subtract(
                        new Value(2),
                        new Multiply(
                                new Value(3),
                                new Value(4))));
        System.out.println(equation.evaluate());
        System.out.println(equation.prettyPrint());
    }
}
