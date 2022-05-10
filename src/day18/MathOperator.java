package day18;

import java.util.Scanner;

public class MathOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       while (true){
            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("enter the second number");
            int num2 = input.nextInt();

            System.out.println("Enter a math operator");
            char ch = input.next().charAt(0);

            while (!(ch == '+' || ch == '-' || ch == '/' || ch == '*')) {
                System.out.println("Invalid operator, provides a valid operator");
                ch = input.next().charAt(0);
            }
            int result = 0;

            if (ch == '+') {
                result = num1 + num2;

            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }
                System.out.println(result);


            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("invalid entry,provides a valid entry");
                a = input.next().toLowerCase();
            }

            if (a.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
               break;
            }


                }
       input.close();

            }


        }







/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to invalid entry, until user provides a valid entry
 */