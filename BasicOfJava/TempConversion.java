package BasicOfJava;
import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        
        // TEMPERATURE CONVERSION PROGRAM
        Scanner obj = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = obj.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F)");
        unit = obj.next().toUpperCase();
        
        // TERNARY OPERATOR
       newTemp = (unit.equals("C")) ? (temp - 32) *5/9 : (temp*9/5) +32;

        System.out.printf("%.2f",newTemp);

     obj.close();


    }
}
