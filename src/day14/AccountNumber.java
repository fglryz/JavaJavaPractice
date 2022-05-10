package day14;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter an account number");
        String accountNum = input.next();

        String result =" ";

        if (accountNum.charAt(0)==50 && accountNum.length() ==7
                || accountNum.charAt(0)==53 && accountNum.length()==10) {
            result ="valid";
        }else {
                result ="account number is invalid";
            }
            System.out.println(result);








        input.close();
    }
}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */