package Level02Java;
import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {

        //Nested Loop =>  A loop inside another loop 
        


        Scanner obj = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = obj.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = obj.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = obj.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
                
            }
            System.out.println();
            
        }

        obj.close();
    }
    
}
