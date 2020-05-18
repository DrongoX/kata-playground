import static java.lang.Integer.parseInt;

public class RpnCalculator {

    public Integer calculate(String input) {
        return isConstantExpression(input) ? constant(input) : addition(input);
    }

    private int constant(String input) {
        return parseInt(input);
    }

    private int addition(String input) {
        var inputs = input.split(" ");
        return parseInt(inputs[0]) + parseInt(inputs[1]);
    }

    private boolean isConstantExpression(String input) {
        return !input.contains(" ");
    }
}
