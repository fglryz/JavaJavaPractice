package day18;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        while(true) {
            System.out.println("Which room would you like to select?");


            String bedType = scan.nextLine().toLowerCase();


            while (!(bedType.equals("king bed") || bedType.equals("queen bed") || bedType.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                bedType = scan.nextLine().toLowerCase();
            } // to make sure user selected either the king bed, or queen bed or single bed


           if (bedType.equals("king bed")){
               total +=120;
           }else if(bedType.equals("queen bed")) {
               total += 100;
           }else {
               total +=80;
           }
            System.out.println("How many night are you staying?");
           int night =scan.nextInt();


        String z = scan.nextLine();
            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                a = scan.next().toLowerCase();
            } // it stops if the answer is either ye or no


            if(a.equals("no")){
                System.out.println("Your total price is: $"+ total * night);
                break;
            }


        }

        scan.close();


    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */