/**
 * Created by andeski on 6/21/16.
 */
import java.util.Scanner;// in the top!

public class Functions {



    public static void main(String[] args) {
        parameterCount("animals","two");
        stringLength("hello");
        longestString("Cow_and","Chicken");
        userInput();
        typeQuit();
    }

    public static void parameterCount(String... manystrings) {
        System.out.println(manystrings.length);
    }

    public static int stringLength(String string_a) {
        System.out.println(string_a.length());
        return string_a.length();
    }

    public static String longestString(String string_a, String string_b) {
        if (string_a.length() > string_b.length() ) {
            System.out.println(string_a);
            return string_a;
        }
        else {
            System.out.println(string_b);
            return string_b;
        }
    }

    public static void userInput() {
        Scanner question = new Scanner(System.in);
        String input = question.next();
        System.out.println(input);
        System.out.println("Yes");
    }


    // The following asks
    public static void typeQuit() {
        Scanner question = new Scanner(System.in);
        String input = question.next();
        if(input.equals("quit this line, whoop whoop!")) {
            System.out.println(input + ": The system is exiting");
        }
        typeQuit();
    }

}