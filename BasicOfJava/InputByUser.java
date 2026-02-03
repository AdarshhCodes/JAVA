package BasicOfJava;
import java.util.Scanner;

public class InputByUser {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = obj.nextLine();
        //If we only use next, then it will read only the first word...ex Hello adarsh, it only read Hello, ignores Adarsh.

        System.out.print("Enter your age: ");
        int age = obj.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        obj.close();
    }
}
