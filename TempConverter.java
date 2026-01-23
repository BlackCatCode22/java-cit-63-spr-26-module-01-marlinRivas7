//Converting temperature from Fahrenheit to Celsius
//Types of math equations:
//https://www.w3schools.com/java/java_operators_arithmetic.asp

import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner Fah = new Scanner (System.in);

        double F;
        System.out.println("Fahrenheit temperature: ");
        F = Fah.nextDouble();
        double Celsius = (F - 32) * 5/9;
        System.out.println("The conversion of temperature from Fahrenheit to Celsius is ");
        System.out.println(Celsius);
    }
}