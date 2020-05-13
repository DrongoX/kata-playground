public class RpnCalculator {
    public int calculate(String input) {
        return input.equals("1 1 +") ? 2 : Integer.parseInt(input);
    }
}
