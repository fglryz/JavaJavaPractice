package day16;

import java.util.Locale;
import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double price =0;


        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your gender");
        char gender = input.next().charAt(0);

        while (!(gender== 'f' || gender =='m')){
            System.out.println("Invalid entry, re-enter a valid entry");
            gender =input.next().toLowerCase().charAt(0);

        }
        System.out.println("Are you married?");
        String married = input.next().toLowerCase();

        while (! (married.equals("yes") || married.equals("no"))){

            System.out.println("invalid entry, re=enter a valid entry");
            married = input.next().toLowerCase();
        }

        System.out.println("Enter your age");
        int age = input.nextInt();
       while (!(age > 0 && age<120)) {
           System.out.println("invalid entry, re=enter a valid entry");
           age = input.nextInt();
       }

        System.out.println("How many miles he/she drives in a day?");
        int mile = input.nextInt();

        while(!(mile>5) ){
            System.out.println("Invalid entry, pleas re-enter a valid entry");
            mile = input.nextInt();
        }
        String str = input.nextLine();
        System.out.println(" What do you want full coverage or liability insurance?");
        String ins = input.nextLine();
        while (!(ins.equals("full coverage") ||ins.equals("liability insurance"))){
            System.out.println("Invalid entry, pleas re-enter a valid entry");
            ins = input.nextLine();

        }

        System.out.println("Have you had any accident or claims in past 5 years?");
        String accident  = input.next().toLowerCase();

        while (!(accident.equals("yes")||accident.equals("no"))){
            System.out.println("Invalid entry, pleas re-enter a valid entry");
            accident  = input.next().toLowerCase();
        }
        System.out.println("Does your car has an anti-theft device?");
        String anti_theft = input.next();

        while (!(anti_theft.equals("yes") || anti_theft.equals("no"))){
            System.out.println("Invalid entry, pleas re-enter a valid entry");
            anti_theft = input.next();
        }
if (ins.equals("liability insurance")){
                if (age < 25){
                    price += 90;
                }else{
                    price += 50;
                }
                if (mile<10){
                    price += 10;
                }else if (mile>10 && mile<=50){
                    price += 30;
                }else {
                    price += 50;
                }

            }
            if (ins.equals("full coverage")) {

                if (age < 25) {
                    price += 160;
                } else   {
                    price += 120;
                }  if (mile < 10) {
                    price += 20;
                } else if (mile > 10 && mile <= 50) {
                    price += 40;
                } else {
                    price += 70;
                }
            }

if (anti_theft.equals("yes")){
    price -= price * 5/100;
}
if (accident.equals("yes")){
    price += price *15 / 100;
}else {
    price -= price* 10/100;
}if (married.equals("yes")){
    price -= price*5/100;
        }

        System.out.println("price = " + price);
input.close();
    }
}
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user
*/

    /*Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70*/


			  /*  If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */