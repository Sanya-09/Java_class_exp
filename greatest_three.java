// Create a program that accepts three integers and determines the greatest among them using nested if-else statements.
public class greatest_three {

    public static int greatest(int a, int b, int c) {
        if (a > b && a > c) {
            return a; 
        } else if (b > c) {
            return b; 
        } else {
            return c; 
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int c = 2;

        int result = greatest(a, b, c);

        System.out.println("Greatest of Three is " + result);
    }
}
