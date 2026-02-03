package BasicOfJava;
 import java.util.Scanner;
public class CondtionalStatements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter your name: ");
        name = obj.nextLine();

        System.out.print("Enter the age: ");
        age = obj.nextInt();
        
        System.out.print("Are you a student (true/false)? ");
        isStudent = obj.nextBoolean();
    
        //If the first statement is true, then rest of the statements will not run even though they are true.

       //GROUP 1 FOR NAME   

        if(name.isEmpty()){
            System.out.println("You didn't enter your name" + "!");
        }
        else{
            System.out.println("Hello " + name);
        }

        // GROUP 2 FOR AGE

        if(age > 18){
            System.out.println("You are an adult!");
        }
        else if(age == 0){
              System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        //GROUP 3 FOR IDENTITY

        if(isStudent){
            System.out.println("You are a student! ");
        }
        else{
            System.out.println("You are not a student!");
        }

        obj.close();
         
    }
}
//IF statement performs a block of code if its condition is true! 