package BasicOfJava;

public class LogicalOperator {
    public static void main(String[] args) {
        double  temp = 20;
        boolean isSunny = true;


        if(temp <=30 && temp>=0 && isSunny){
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside");
        }
        else if( temp <=30 && temp >=0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println(
                "It is cloudy outside!"
            );
        }
        else if(temp >=30 || temp <20){
          System.out.println("The weather is good");
        }
        
    }
    
}
