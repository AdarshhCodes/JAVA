package BasicOfJava;
import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the length of a: ");
        a = obj.nextInt();
        System.out.print("Enter the length of b: ");
        b = obj.nextInt();
        int SumOfSquare = a*a + b*b;
        double c = Math.sqrt(SumOfSquare);
        System.out.println("The hypotenuse of a trianlge is: " + c);

      obj.close();
    }
    
}
