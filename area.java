// Write a program to find area of triangle.
public class area {
    public static double calculate(double height , double base) {
        return 0.5*base*height;
    }
    public static void main(String[] args) {
        double height = 10.0;
        double base = 5.0 ;
        double area = calculate(height , base); 
        System.out.println("Area of the Triangle: " + area); 
    }
}
