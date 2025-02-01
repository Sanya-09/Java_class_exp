public class floyd_triangle{
public static void flyod_tri(int n){
        int counter = 1;
           // n = number of level in pyramid
        // outer loops for number of lines 
        for(int i=1 ; i<=n ;i++){
            // inner loop 1 for spaces 
            for (int j = 1 ; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            // inner loop 2 for stars
            for (int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
public static void main(String[] args) {
        flyod_tri(5);
}
}
