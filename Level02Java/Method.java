package Level02Java;

public class Method {

    //method = a block of reusable code that is executed when called ()    
    public static void main(String[] args) {
    String name = "Adarsh";
    int age = 20;

    if(checkAge(22)){
        System.out.println("You may sign up!");
    }
    else{
        System.out.println("You must be 18+ to sign up");
    }

    // happyBirthday(name, age);
    System.out.println(cube(3));
    String fullName = getFullName("Adarsh", "Singh");
    System.out.println(fullName);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
    }
     
    static double cube(double number){

        return number*number*number;
    }
     
    static String getFullName(String first, String last){
        return first + " " + last;
    }
     
    static boolean checkAge(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }

    }
}
