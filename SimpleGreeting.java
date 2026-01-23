/*
Scanner class:
 https://www.w3schools.com/java/java_user_input.asp
*/

import java.util.Scanner;

public class SimpleGreeting {
    public static void main (String[] args) {
        System.out.println ("!Hello, welcome to the program!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
