public class dec_to_bin {
    public static void dectobin(int n){
        int bin = n;
        int pow = 0 ;
        int binNum = 0;

        while(n>0){
            int rem = n %2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary for of "+ bin + " = "+ binNum);
    }
    public static void main(String[] args) {
        dectobin(5);
    }
}
