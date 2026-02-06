package Level02Java;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit");

            response = obj.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        obj.close();

    }
} 

// while loop -> check the condition first then execute the program
// do-while -> execute the program first then check the condition