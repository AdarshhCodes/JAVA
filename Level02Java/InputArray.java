package Level02Java;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;
        
       // String[] foods = new String[3]; //declare an empty array with space of 3 
       // System.out.println(foods.length);
       System.out.print("What # of food do you want?: ");
       size = scanner.nextInt();
       scanner.nextLine();

       foods = new String[size];


       for(int i = 0; i < foods.length; i++){
        System.out.print("Enter a food: ");
          foods[i] = scanner.nextLine();
       }

        for( String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
