package day19_LoopPractice;

import java.util.Scanner;

public class Task1_Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
       if (!(radius >0)){
           System.err.println("Invalid Entry for the radius of the circle");
           System.exit(0);

       }

       double Diameter= 2 * radius;
       double area = 3.14 * radius * radius;
       double perimeter =2 * 3.14 * radius;

            System.out.println("Diameter = " + Diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String a = input.next().toLowerCase();


            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("invalid entry, please re enter a valid entry");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }

input.close();



    }
}

/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error
				message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */