package BasicOfJava;

public class Printf {
    public static void main(String[] args) {
        
        String name = "Adarsh";
        char firstLetter = 'A';
        int age = 20;
        double height = 5.4;
        boolean isStudent = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a %c\n",firstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your height is %f\n", height);
        System.out.printf("Student %b\n", isStudent);

    }
}

//printf is a method used to format output
//%[flags][width][.precision][specifier-character]


// 1 => Flags
// + = output a plus (rg = %+.2f)
// , = comma grouping separator
// ( = negative nunmbers are enclosed in ()
// space = display a minus if negative, space if positive

// 2 => Width  
// 0 = zero padding  (eg :  take 4 id1, id2, ...id4 name it to 1, 23, 456, 7890).. it fills the gap with spaces and zero according to the number given.
// number = right justified padding
// negative number = left justified padding