package day17;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name");
        String un = input.next();

        System.out.println("Enter your password");
        String pw = input.next();

        if (un.equals("Cydeo") && pw.equals("Cydeo123")){
            System.out.println("Log in");
        }else {
          int  attempts = 3;

           while (!(un.equals("Cydeo") && pw.equals("Cydeo123") )&& attempts>0) {

               if (attempts == 1) {
                   System.out.println("THIS IS YOUR LAST CHANCE");

               }
               System.out.println("Incorrect Password or User name' please re-enter");
               System.out.println("Enter your user name");
               un = input.next();


               System.out.println("Enter your password");
                pw = input.next();
               attempts--;
           }
           if (un.equals("Cydeo") &&pw.equals("Cydeo123")){
               System.out.println("Log in");
           }else {
               System.out.println("Your account is locked");
           }

        }
    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}



 */