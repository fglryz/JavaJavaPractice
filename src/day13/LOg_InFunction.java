package day13;

import java.util.Scanner;

public class LOg_InFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your user name");
        String userName = input.next();
        String passWord = input.next();
        String result = " ";

        if (userName.equals("Cydeo")  && passWord.equals("WoodenSpoon")){
            result = "Log in";
        }else {
            result = "Incorrect username or password";
        }
        System.out.println(result);

input.close();

    }
}
/*
8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method


 */