import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter operator:");
        char op = sc.next().charAt(0);

        switch(op){
            case '+': System.out.println(a+b);
                     break;
            case '-': System.out.println(a-b);
                     break;
            case '*': System.out.println(a*b);
                     break;
            case '/': System.out.println(a/b);
                     break;
            case '%': System.out.println(a%b);
                     break;
            default: System.out.println("Calculator is not that advanced!!");
        }
    }
}

