package BasicOfJava;
import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        
        //Enhanced switch = A replacement to many else if statements
        //(Java14 feature)
        String day;
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the day: ");
        day = obj.nextLine();


        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its a weekday!");
            case "Saturday", "Sunday" -> System.out.println("Its the weekend!");
            default -> System.out.println(day + " is not a day");
           
        }
     
        obj.close();


    }
    
}
