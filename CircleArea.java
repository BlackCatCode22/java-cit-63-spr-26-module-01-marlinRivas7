//Math.PI is a mathematical tool:
// https://www.w3schools.com/python/ref_math_pi.asp
//

import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        System.out.println("Please enter the radius number: ");
        double radius = result.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}