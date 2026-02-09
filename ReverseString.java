
import java.util.Scanner;
public class ReverseString {
    static String reverse(String str) {
        String output;
        int i;
        output = "";
        for (i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("!!Welcome to our program!!");
        System.out.println("Please enter the word/phase that you want to reverse: ");
        String answer = string.next();
        String result = reverse(answer);
        System.out.println("The result is: " + result);
    }
}