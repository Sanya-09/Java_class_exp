// Write a program to find simple interest. 
public class si {
    public static double interest(double p , double r , int t) {
        return p*r*t/100;
    }
    public static void main(String[] args) {
        double p = 100000;
        double r= 3.0;
        int t= 4;
        double si = interest(p , r , t);
        System.out.println("Simple Interest:- "+ si);
    }
}
