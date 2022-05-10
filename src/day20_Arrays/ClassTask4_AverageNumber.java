package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClassTask4_AverageNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("How many number would you like to enter?");
        int in = input.nextInt();
        int numbers[]= new int[in];
        int total = 0;

        for (int i = 0; i < in; i++) {

            System.out.println("Enter "+(i +1)+ ". number please");
            numbers[i]= input.nextInt();
            total += numbers[i];


        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(total/in);
        input.close();

    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number


 */