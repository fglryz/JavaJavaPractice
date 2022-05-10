package day09;

public class MaximumNumber {

    public static void main(String[] args) {

         int n1 = 100;
         int n2 = 200;

        boolean n1IsMaximum = n1 > n2;
        boolean n2IsMaximum = n2 > n1;
        boolean equal =n1 == n2;

        if (n1IsMaximum){
            System.out.println(n1 + " is maximum number");

        }
        if (n2IsMaximum){
            System.out.println(n2 + " is maximum number");
        }

        if (equal){
            System.out.println("equal");
        }






       }
    }


/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number


 */