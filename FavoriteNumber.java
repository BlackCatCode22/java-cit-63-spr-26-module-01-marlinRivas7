//Concept: variables
//https://www.w3schools.com/java/java_variables_identifiers.asp


import java.util.Scanner;
public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Welcome once again!");
        System.out.println("What is your favorite number? ");

        String response = number.nextLine();
        System.out.println(response + ", that's a great number");
        System.out.println("My favorite is number 7!");
    }
}