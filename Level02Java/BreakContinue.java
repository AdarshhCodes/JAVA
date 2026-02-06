package Level02Java;

public class BreakContinue {
    public static void main(String[] args) {
        
      //Break = break out of a loop (STOP)
      //Continue = Skip current iteration of a loop (SKIP)
       for(int i = 0; i<10; i++){
        if( i == 6){
             continue;
        }
        System.out.print(i + " ");
       }
    }
}
