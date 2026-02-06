package Level02Java;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int start = 10;
        for (int i = 10; i >0; i--) {
             System.out.println(i);
             Thread.sleep(1000);
        }
       System.out.println("Kya kr rha idhar?");
    }
}
