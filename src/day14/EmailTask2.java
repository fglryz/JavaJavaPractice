package day14;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an email");
        String email = input.next();

        int indexOf_ = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
        int indexDot = email.indexOf(".");

        String firstName = email.substring(0,email.indexOf("_"));
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String lastName = email.substring(indexOf_+1, indexOfAtSign);
        lastName = lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();

        System.out.println("lastName = " + lastName);

        String domainName = email.substring(indexOfAtSign +1, indexDot);
        System.out.println("domainName = " + domainName);



      input.close();
    }
}
/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and
       followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name,
        last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple


 */