import static java.lang.Integer.parseInt;

public class RPNCalculator {
    public static int calculate(String entry) {
        final String[] splitEntry = entry.split(" ");

        if (isSingleValue(splitEntry)) {
            return parseInt(splitEntry[0]);
        }

        return parseInt(splitEntry[0])
                + parseInt(splitEntry[1]);
    }

    private static boolean isSingleValue(final String[] splitEntry) {
        return 1 == splitEntry.length;
    }
}
