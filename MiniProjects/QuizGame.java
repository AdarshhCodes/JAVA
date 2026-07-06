package MiniProjects;
import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        
        //JAVA QUIZ GAME

        //Questions array[]
        //OPTIONS array[][]
        //Declare variables
        //Welcome message
        //Question (loop)
        //  Options
        //  Get Guess from user
        //  check our guess
        //  display final score

        String[] questions = {"What is Java?",
                              "What is the other name of java?",
                              "Is Java is object-oreinted?",
                              "What is JVM in java?"
        };

        String[][] options = {{"1. A programming Language", "2. A fruit", "3. Actor", "4. Cricket"},
                             {"1. chai", "2. Coeffe", "3. beans", "4. tomoto"},
                             {"1. yes", "2. No", "3. maybe", "4. depends on the jvm"},
                             {"1. joint vibe mode", "2. Java vibed machine", "3. Java virtual machine", "4. jai valaMdir"},
    };
   
    int[] answers = {1,3,1,3};
    int score = 0;
    int guess;

    Scanner scanner = new Scanner(System.in);
System.out.println("**************************");
System.out.println("Welcome to the Java Quiz Game!");
System.out.println("**************************");

for(int i = 0; i<questions.length; i++){
    System.out.println(questions[i]);

    for(String option : options[i]){
        System.out.println(option);
    }

    System.out.print("Enter your guess: ");
    guess = scanner.nextInt();

    if(guess == answers[i]){
        System.out.println("********");
        System.out.println("CORRECT!");
        System.out.println("********");
        score++;

    }
    else{
        System.out.println("********");
        System.out.println("WRONG!");
        System.out.println("********");

    }
}

   System.out.println("Your final score is: " + score + " out of " + questions.length);

     scanner.close();
    }
}
