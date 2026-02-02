package BasicOfJava;

public class Variables {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int age = 20;
        int year = 2026;

        double price = 20.5;
        double gpa = 9.04;
        double overs = 23.5;
        
        char grade = 'O';
        char symbol = '!';

        // used in if else statments
        boolean isDrunk = true;
        boolean isSmall = false;
        

        String name = "Adarsh Singh";
        String branch ="CSE-DS";


        System.out.println("Hello " + name  + " " + branch );


    }
}


//variable = a reusable container for a value.

//Primitive = simple value stored directly in memory(stack)
//Reference = memory address (stack) that points to the (heap)

// Primitive    vs   Reference

//int                 string
//char                array
//double              object
//float
//boolean

//There are two steps ro create a variable
// 1> declaration
// 2> assignment