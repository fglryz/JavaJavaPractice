package day23;

public class EligibleAlcoholVote {

    public static void main(String[] args) {

        eligibleAlcohol(53);

        System.out.println("---------------------------------");

        eligibleVote(32, true);

    }

    public static void eligibleAlcohol(int age){

        if (age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static void eligibleVote (int age, boolean hasCitizin){


        if ((age>18 && age<=120) && (hasCitizin ==true)){
            System.out.println("you are  eligible to vote");
        }else {
            System.out.println("you are not eligible to vote");
        }
    }
}
//3. create a method that can check if a person is eligible to buy alcohol