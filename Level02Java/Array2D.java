package Level02Java;

public class Array2D {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // useful for storing a matrix of date

        String[] fruits = { "apple", "banana", "grapes", "orange" };
        String[] fakeFriends = { "Rahul", "Hemant", "Lakshay", "Jatin" };
        String[] vegetables = { "potato", "onion", "carrot" };

        String[][] groceries = {fruits, fakeFriends, vegetables };
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.println(food + " ");
            }
            System.out.println();
        }

    }
}
