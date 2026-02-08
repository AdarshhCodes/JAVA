package MiniPorjects;
import java.util.Scanner;
import java.util.Random;
public class RandomGuessing {
    public static void main(String[] args) {
        
        // Number Guessing Game
       Random rand = new Random();
       Scanner obj =  new Scanner(System.in);
        
       int guess;
       int attempts = 0;
       int min = 0;
       int max = 100;
       int randomNumber = rand.nextInt(min,max+1);

       System.out.println("Number Guessing Game");
       System.out.println("Guess a number between 1-100: ");


       do{
        System.out.println("Enter a guess: ");
        guess = obj.nextInt();
        attempts++;

        if(guess < randomNumber){
            System.out.println("TOO LOW! Try again");
        }
        else if(guess > randomNumber){
            System.out.println("TOO HIGH! Try again");
        }
        else {
            System.out.println("Correct! The number was " + randomNumber);
            System.out.println("Number of attemps: " + attempts );
        }
       }while(guess != randomNumber);

       obj.close();



    }
    
}
