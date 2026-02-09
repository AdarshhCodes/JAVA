package Level02Java;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
      //array = a collection of values of the same data type
      // * think of it as a variable that can store more than 1 value *

      String[] fruits = {"apple", "banana","orange", "coconut"};

     // fruits[0] = "pineapple";
      int numOfFruits = fruits.length;

      Arrays.sort(fruits); //sort the array in alphabetical order
      Arrays.fill(fruits, "pineapple"); //change all fruits to pineapple


      //access all elements of the array
     // for(int i = 0; i<numOfFruits; i++){
      //  System.out.println(fruits[i]);
     // }

     for(String fruit : fruits){
        System.out.println(fruit);
     }



    }
}
