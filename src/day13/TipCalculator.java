package day13;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String yesOrNo = input.next();

        System.out.println("Enter the number of people");
        int numOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Poor");
        String service = input.next().toLowerCase();

        double tipRate = (service.equals("excellent"))? 0.25 :(service.equals("great"))? 0.20
                : (service.equals("good"))? 0.15 : (service.equals("poor"))? 0.10 : 0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people = " + numOfPeople);
        System.out.println("Total to pay = " + amount);
        System.out.println("Total tip = " + totalTip);

        if (yesOrNo.equals("yes")) {
            System.out.println("Total per person: " + ((amount + totalTip) / numOfPeople));
            System.out.println("Tip per person: " + (totalTip / numOfPeople));
        }
        input.close();




    }
}
