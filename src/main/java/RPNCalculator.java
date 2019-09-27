import static java.lang.Integer.parseInt;

public class RPNCalculator {
    public static int calculate(String entry) {

        if (isSingleValue(entry)) {
            return getFirstValue(entry);
        }

        if(isDivisionOperator(entry)) {
            return getFirstValue(entry) / getSecondValue(entry);
        }

        return getFirstValue(entry) + getSecondValue(entry);
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

    private static boolean isSingleValue(final String entry) {
        return 1 == entry.split(" ").length;
    }
}
