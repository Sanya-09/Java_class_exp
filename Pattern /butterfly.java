public class butterfly {
  public static void butterfly(int n){
    // upper half 
        for(int i = 1 ; i<=n ; i++){
            // star + space + star 
            // star
            for (int j = 1 ; j<=i ; j++ ){
                System.out.print("*");
            }
            // space
            for (int j = 1 ; j<=(n-i); j++){
                System.out.print("  ");
            }
            // star
            for (int j = 1 ; j<=i ; j++ ){
                System.out.print("*");
            } System.out.println();
        }
    // lower half 
        for(int i = n ; i>=1 ; i--){
             // star + space + star 
            // star
            for (int j = 1 ; j<=i ; j++ ){
                System.out.print("*");
            }
            // space
            for (int j = 1 ; j<=(n-i); j++){
                System.out.print("  ");
            }
            // star
            for (int j = 1 ; j<=i ; j++ ){
                System.out.print("*");
            } System.out.println();
    }
}
    public static void main(String[] args) {
        butterfly(5);
    }
}
