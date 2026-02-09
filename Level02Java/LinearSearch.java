package Level02Java;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int [] numbers = {1,9,2,8,3,5,4};
        int target;
        boolean isFound = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        target = scanner.nextInt();

        for(int i = 0; i<numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("The target is at index: " + i);
                isFound = true;
                break;
            }
          
        }
        if(!isFound){
            System.out.println("Element not found!");
        }
        scanner.close();
        
    }
    
}
