// Write a program to calculate the final grade of a student based on the marks entered in three subjects. Use the following grading scale:
// Average >= 90: Grade A
// Average >= 75: Grade B
// Average >= 50: Grade C
// Otherwise: Grade F

public class grade {
    public grade() {
    }
 
    public static void main(String[] var0) {
       marks(10, 50, 70);
    }
 
    public static void marks(int var0, int var1, int var2) {
       int var3 = (var0 + var1 + var2) / 3;
       if (var3 >= 90) {
          System.out.println("Grade A");
       } else if (var3 >= 75) {
          System.out.println("Grade B");
       } else if (var3 >= 50) {
          System.out.println("Grade C");
       } else {
          System.out.println("Grade F");
       }
 
    }
 }
