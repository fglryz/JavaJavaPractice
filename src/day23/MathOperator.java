package day23;

import java.util.Scanner;

public class MathOperator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter a math operator");
        char ch = input.next().charAt(0);

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        int result = 0;
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {

            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '/') {
                result = num1 / num2;
            } else {
                result = num1 * num2;
            }
            System.out.println(result);

        } else {
            System.out.println("Invalid math operator");
        }



    }
}
//15. create a method named calculator that passes three arguments
// (num1, num2, mathOperator), prints the calculation result