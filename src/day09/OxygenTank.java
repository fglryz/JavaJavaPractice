package day09;

public class OxygenTank {

    public static void main(String[] args) {

        int full = 69;

        if(full >= 90){
            System.out.println("Your tank is full");
        }
        else if(full >= 80 && full <=89){
            System.out.println("Still Okay");
        }
        else if(full >= 70 && full <=79){
            System.out.println("Don't go too far");
        }
        else if(full >= 60 && full <= 69){
            System.out.println("Start to head back");
        }
        else{
            System.out.println("Be careful now you  at 50%");
        }

    }
}

/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you  at 50%

                USE ONE PRINT STATEMENT ONLY

 */