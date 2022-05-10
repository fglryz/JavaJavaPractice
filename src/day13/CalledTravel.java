package day13;

import java.util.Scanner;

public class CalledTravel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport");
        String yesOrNo = input.next().toLowerCase();


        if (yesOrNo.equals("yes")){
        int baseCost = 1000;

        input.nextLine();

        System.out.println("Where do you want to go?");
        String country = input.nextLine();

        System.out.println("How many bags do you have?");
        byte bag = input.nextByte();
        baseCost += 50 *bag;

        System.out.println("how many people do you travel with");
        int numOfPeople = input.nextInt();
        if(numOfPeople < 3) {
            baseCost -= 100 * numOfPeople;
        }else{
            baseCost -= 300;

           input.nextLine();

            System.out.println("Enter the name of the people they will travel with in one line, " +
                    "separating each name with a comma");
            String names = input.nextLine();


        }System.out.println("Your ticket is booked to "+ country + "."+"\n We have charged extra for the bag $"+bag+
                    " but you are travelling with number of people "+numOfPeople+" so we are giving a discount." +
                            " Your total cost is $" +baseCost);

        }else{// if user does not have a valid passport
            int baseCost = 200;
            System.out.println("When did your passport expire?");
            int expiredYear = input.nextInt();
            baseCost +=  75*(2021 -expiredYear);
            input.nextLine();
            System.out.println("Which country are you traveling too?");
            String country = input.nextLine();
            System.out.println("Will you be traveling in the next year (yes or no)?");
            String answer = input.next().toLowerCase();

            if (answer.equals("yes")){
                baseCost += 100;
            }else{
                baseCost -= 50;
            }

            System.out.println("Looks like your password has been expired for "+(2021-expiredYear)
                    +", but not to worry we will get it ready for you to travel to "+country
                    +". Your total cost has come out to $"+baseCost);

input.close();
        }

    }
}/*
Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags but you are traveling
            		with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"

/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags but you are traveling
            		with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			 Your total cost has come out to $costAmount."


 */