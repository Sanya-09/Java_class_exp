public class Number{
public static void inv_half_py(int n){
          // n = number of level in pyramid
        // outer loops for number of lines 
        for(int i=n ; i>=1 ;i--){
            // inner loop 1 for spaces 
            for (int j = 1 ; j <= i; j++){
                System.out.print(j);
            }
            // inner loop 2 for stars
            for (int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

  public static void main(String[] args) {
        inv_half_py(5);
    }
}
