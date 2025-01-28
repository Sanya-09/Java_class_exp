// factorial using function and loop 
// input from user

import java.util.*;

public class factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<= n ; i++){
            fact = fact *i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.print("Factorial is: "+ fact);
    }
  // calculating binomial function using factorial 
  public static int bin_coeff(int n , int r){
       int a = factorial(n);
       int b = factorial(r);
       int c = factorial(n-r);
       int coeff = a /(b*c);
       return coeff;
  }
}




