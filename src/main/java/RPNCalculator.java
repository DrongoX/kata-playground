public class RPNCalculator {

  public int calculate(String input) {
    if (isAddition(input)) {
      return calculateAddition(input);
    }
    return getIntConstant(input);
  }

  private int getIntConstant(String input) {
    return Integer.parseInt(input);
  }

  private int calculateAddition(String input) {
    String[] inputs = input.split(" ");
    return getIntConstant(inputs[0]) + getIntConstant(inputs[1]);
  }

  private boolean isAddition(String input) {
    return input.endsWith("+");
  }
}
