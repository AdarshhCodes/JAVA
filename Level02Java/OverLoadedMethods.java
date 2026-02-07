package Level02Java;

public class OverLoadedMethods {
    public static void main(String[] args) {
        
        //overloaded methods = method that share the same name, but different parameters
        //signature = name + parameter


     System.out.println(add(2, 5));
     System.out.println(add(2, 5,3));

     String pizza = bakePizza("flat bread", "mozzarella");
     System.out.println(pizza);

    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

}
