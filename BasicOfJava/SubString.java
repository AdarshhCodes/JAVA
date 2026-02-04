package BasicOfJava;

public class SubString {
    public static void main(String[] args) {
        
       // .substring() = A method used to extract a portion of a string
       // string.substring(start,end)

       String email = "adarshsingh@gmail.com";
    //    String username = email.substring(0,6);
       String username = email.substring(0, email.indexOf("@"));
       String domain = email.substring(email.indexOf("@"));
       System.out.println("The username is : " + username);
       System.out.println("The domain of the user is : " + domain);
    }
}
