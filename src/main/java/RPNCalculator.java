import java.rmi.UnexpectedException;

import static java.lang.Integer.parseInt;

public class RPNCalculator {
    public static int calculate(String entry) {

        if (isSingleValue(entry)) {
            return getFirstValue(entry);
        }

        Operator operator = getOperator(entry);

        return operator.execute(getFirstValue(entry), getSecondValue(entry));
    }

    private static Operator getOperator(String entry) {
        final String operator = entry.split(" ")[2];
        switch(operator){
            case "/":
                return Operator.DIVISION;
            case "*":
                return Operator.MULTIPLICATION;
            case "-":
                return Operator.SUBTRACTION;
            case "+":
                return Operator.ADDITION;
            default:
                throw new IllegalArgumentException(String.format("Unknown operator %s", operator));
        }
    }

    private static int getSecondValue(String entry) {
        return parseInt(entry.split(" ")[1]);
    }

    private static int getFirstValue(String entry) {
        return parseInt(entry.split(" ")[0]);
    }

    private static boolean isDivisionOperator(String entry) {
        return entry.split(" ")[2].equals("/");
    }

    private static boolean isSubtractionOperator(String entry) {
        return entry.split(" ")[2].equals("-");
    }

    private static boolean isMultiplicationOperator(String entry) {
        return entry.split(" ")[2].equals("*");
    }

    private static boolean isSingleValue(final String entry) {
        return 1 == entry.split(" ").length;
    }
}
