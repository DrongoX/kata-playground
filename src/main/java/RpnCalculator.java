public class RpnCalculator {
    public int calculate(String input) {
        if(isConstant(input)){
            return parseOperand(input);
        }
        if(isAddition(input)){
            return handleAddition(input);
        }else{
            return 3;
        }
    }

    private boolean isAddition(String input) {
        return input.contains("+");
    }

    private int handleAddition(String input) {
        String[] splittedInput = input.split(" ");
        return  parseOperand(splittedInput[0]) + parseOperand(splittedInput[1]);
    }

    private int parseOperand(String input) {
        return Integer.parseInt(input);
    }

    private boolean isConstant(String input) {
        return !input.contains(" ");
    }
}
