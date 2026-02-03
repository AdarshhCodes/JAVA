package BasicOfJava;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        double width = 0;
        double length = 0;
         Scanner obj1 = new Scanner(System.in);
         System.out.print("Enter the width of rectangle : ");
          width = obj1.nextDouble();
         System.out.print("Enter the length of the rectangle: ");
          length = obj1.nextDouble();

         double area = length*width;
         System.out.println("The area of the rectangle is : " + area);

       obj1.close();
    }
}
