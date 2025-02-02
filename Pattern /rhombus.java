public class rhombus{
  public static void solid_rhombus(int n){
    for(int i = 1 ; i<=n ; i++){
        // space star space
        // space
        for(int j = 1 ; j<=(n-i); j++){
            System.out.print(" ");
        }
        // star 
        for(int j = 1 ; j<=n; j++){
            System.out.print("*");
        }System.out.println();
    }
}
  public static void hollow_rhombus(int n){
   for(int i = 1 ; i<= n ; i++){
        // hollow rhimbus = tilted hollow recytangle 
        for(int j = 1 ; j<=(n-i) ; j++){
            System.out.print(" ");
        }
        // hollow rectangle stars 
        for(int j = 1 ; j<=n ; j++){
            if( i == 1 || i == n || j ==1 || j== n){
                // boundary condition
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();
    }
  }
    public static void main(String[] args) {
        solid_rhombus(5);
        hollow_rhombus(5);
    }
}
