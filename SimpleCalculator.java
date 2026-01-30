//A user can input two numbers and perform basic math operations (+, -, *, /)
//Sources: https://www.w3schools.com/programming/prog_operators_arithmetic.php
//https://www.w3schools.com/java/java_ref_string.asp

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner operation = new Scanner (System.in);

        System.out.println("!Welcome back!");
        System.out.println("===========================================");
        System.out.println("Please enter the first number for your equation: ");
        int math = operation.nextInt();
        System.out.println("Now, please enter the second number: ");
        int RG = operation.nextInt();
        operation.nextLine();

        System.out.println("Please enter the arithmetic operator: ");
        String op = operation.nextLine();

        double W = 0;
        if (op.equals("-")) {
            W = math - RG;
        } else if (op.equals("+")) {
            W = math + RG;
        } else if (op.equals("*")) {
            W = math * RG;
        } else if (op.equals("/")) {
            W = math / RG;
        }

        System.out.println("The answer of your equation is " + W );

    }
}