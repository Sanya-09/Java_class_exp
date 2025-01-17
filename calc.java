//Write a program to implement a command line calculator. (Try for Add sub Mul in same program for 2 digits.)
// (Hint: Integer.parseInt will be used)
// For e.g. java calc 20 + 30
// Output should be Sum of 20 and 30 is 50

public class calc {
    public static int calculate(int num1, int num2 , String operator) {
        switch (operator) {
            case "+" -> {
                return num1 + num2; 
            }
            case "-" -> {
                return num1 - num2; 
            }
            case "*" -> {
                return num1 * num2; 
            }
            default ->  throw new IllegalArgumentException("Invalid operator. Use +, -, or *.");
        }
    }
    
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calc <num1> <operator> <num2>");
            System.out.println("Example: java Calc 20 + 30");
            return;
        }
        try {
            
            int num1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int num2 = Integer.parseInt(args[2]);

            int result = calculate(num1, num2, operator);

            switch (operator) {
                case "+" -> System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
                case "-" -> System.out.println("Difference between " + num1 + " and " + num2 + " is " + result);
                case "*" -> System.out.println("Product of " + num1 + " and " + num2 + " is " + result); // for multiplication use \*
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Both operands must be integers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
