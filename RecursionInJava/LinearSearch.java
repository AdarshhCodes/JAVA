package RecursionInJava;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,23,4,56,76,34};
        int target = 23;
        System.out.println(find(arr, target, 0));
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        else if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
}
