package RecursionInJava;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceSum("", 4);
        System.out.println(diceRet("", 4));
    }
    static void diceSum(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=target && i<=6; i++) {
            diceSum(p+i, target-i);
        }
    }
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list; 
        }
         ArrayList<String> ans = new ArrayList<>();
        for(int i =1; i<=6 && i<=target; i++){
             ans.addAll(diceRet(p+i, target-i));
        }
        return ans;
    }
}
