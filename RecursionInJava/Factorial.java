package RecursionInJava;

public class Factorial {
    public static void main(String[] args) {
        int result = fact(6);
        System.out.println(result);
    }
    static int fact(int n){
        if(n == 0 || n == 1) return 1;
         return  n*fact(n-1);
    }
}
