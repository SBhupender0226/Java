import java.util.Scanner;

public class ReverseString {

    public static void main( String[] args){

        String StringOriginal = " This is the original String";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Text: ");
        String userInput = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(userInput);
        String reverseString = buffer.reverse().toString();
        System.out.println(StringOriginal);
        System.out.println(reverseString);
        System.out.println(userInput);
    }
}