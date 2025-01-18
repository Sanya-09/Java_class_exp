public class posneg {
    public static void main(String[] args) {
        func(0);
    }
    public static void func(int n) {
        if(n<0){
            System.out.println("Negative Number");
        }
        else if(n>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
