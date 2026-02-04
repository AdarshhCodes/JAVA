package BasicOfJava;

public class StringMethod {
    public static void main(String[] args) {
    String name = "Adarsh Singh";
    int length = name.length();
    char letter = name.charAt(0);
    int index = name.indexOf("d");
    int lastIndex = name.lastIndexOf("h");
    name = name.toUpperCase();
    name = name.toLowerCase(); // uppercase function will be overwrite by the lowercase fun
    name = name.replace("a", "s");

    //othrer function like nameisEmpty(), name.containes(" "), name.equals(" ")

    System.out.println(length);
   
    }
}
