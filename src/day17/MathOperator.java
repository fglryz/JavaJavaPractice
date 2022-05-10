package day17;

import java.util.Scanner;

public class MathOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



            System.out.println("Enter two numbers");

            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Enter math operator");
           char ch =  input.next().charAt(0);

           while (!(ch =='-' || ch == '+' || ch == '/' || ch == '*')){
               System.out.println( "Invalid operator, please re-enter");
               ch = input.next().charAt(0);

           }
            int result =0;
           if (ch == '-'){
               result = num1 - num2;
           }else if (ch == '+'){
             result = num1+num2;


           }else if (ch == '*') {
               result = num1 * num2;
           }else {
               result =num1 / num2;
           }
            System.out.println(result);

input.close();
        }


    }



/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator
		 until user provides a valid operator (+, -, *, /)


 */