package BasicOfJava;
 import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args) {
        //Mad lib game

        Scanner obj = new Scanner(System.in);
         
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter the adjective(description): ");
        adjective1 = obj.nextLine();
        System.out.print("Enter a noun (animal): ");
        noun1 = obj.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = obj.nextLine();
        System.out.print("Enter the verb: ");
        verb1 = obj.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = obj.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo");
        System.out.println("In a exhibit, I saw a animal named " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

      obj.close();



    }
}
