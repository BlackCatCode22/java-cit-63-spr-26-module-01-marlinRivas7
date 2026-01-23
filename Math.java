//Math: Using primitive types to make math operations
//Arithmetic operators:
//https://www.w3schools.com/java/java_operators_arithmetic.asp

public class Math {
    public static void main (String[] args) {
        double principal;
        double rate;
        double interest;
        principal = 10000;
        rate = 1.5;
        interest = principal * rate;

        principal = principal + rate;
        System.out.println("The interest earned is $" + interest);
        System.out.println("The value of the investment after one year is $" + principal);
        System.out.println("=================================================");

        double M = 43;
        int D = 2;
        int L = 5;
        double sum = M + D + L;
        double div = (M * D)/ L;
        System.out.println("The sum of 43, 2, and 5 is " + sum);
        System.out.println("Division equation: " + div);

    }
}
