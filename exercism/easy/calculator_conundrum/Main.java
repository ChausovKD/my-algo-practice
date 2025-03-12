package easy.calculator_conundrum;

public class Main {

    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        String result = operand1 + " " + operation + " " + operand2 + " = ";
        switch (operation) {
            case "+":
                return result + (operand1 + operand2);
            case "*":
                return result + (operand1 * operand2);
            case "/":
                try {
                    return result + (operand1 / operand2);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }

    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);
            if (Character.isLetterOrDigit(currentChar) || currentChar == '-' || Character.isWhitespace(currentChar)) {
                if (currentChar == '-') {
                    i++;
                    currentChar = identifier.charAt(i);
                    stringBuilder.append(Character.toUpperCase(currentChar));
                    continue;
                }
                switch (currentChar) {
                    case ' ' -> stringBuilder.append("_");
                    case '4' -> stringBuilder.append('a');
                    case '3' -> stringBuilder.append('e');
                    case '0' -> stringBuilder.append('o');
                    case '1' -> stringBuilder.append('l');
                    case '7' -> stringBuilder.append('t');
                    default -> stringBuilder.append(currentChar);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Main.clean("my   Id"));
        System.out.println(Main.clean("a-bc"));
        System.out.println(Main.clean("H3ll0 W0rld"));
        System.out.println(Main.clean("a$#.b"));
    }
}
