publuc class inverted_rotated_half_pyramid{
public static void inv_rot_half_pyramid(int n){
        // n = number of level in pyramid
        // outer loops for number of lines 
        for(int i=1 ; i<=n ;i++){
            // ineer loop 1 for spaces 
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            // inner loop 2 for stars
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 public static void main(String[] args) {
        inv_rot_half_pyramid(4);
    }
}
