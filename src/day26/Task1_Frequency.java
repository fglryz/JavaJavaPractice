package day26;

import java.util.Arrays;

public class Task1_Frequency {

    public static void main(String[] args) {

        int []num={1,1,1,1,1,2,2,2,2,2,3,3,35,5,5,58,8,8,8,8,8,8,8,8,8,8,8,88,8};
        int frequency = frequencyOfElement(num,8);
        System.out.println(frequency);

        System.out.println("--------------------------------------------");

        double []arr = {1.2, 1.2, 3.4, 4.5, 5.6, 5.6, 5.6, 5.6, 5.6, 6.3, 8.9, 5.6, 5.6, 5.5};

        int newArr=frequencyOfElement(arr, 5.6);
        System.out.println(newArr);

        System.out.println("-----------------------------------------------");

        char[]chars={'a', 'b', 'c', 'a', 'b', 'a', 'd', 'e', 'a', 'e', 'd', 'a', 'f', 'a'};
        int ch=frequencyOfElement(chars,'a');
        System.out.println(ch);

        System.out.println("-----------------------------------------------");

        String str []= {"Python", "Java", "C#", "C#", "Java", "Java", "Java", "C++", "C++", "C#", "C#", "Python", "Java", "Python", "Java", "Java"};

                int str2 =frequencyOfElement(str, "Java");
        System.out.println(str2);
    }

    public static int  frequencyOfElement(int[]array,int element){



        int count =0;
        for (int each : array) {
            if (each==element){
                count++;
            }

        }
        return count;
    }
    public static int frequencyOfElement (double []array, double element){

        int count =0;

        for (double each : array) {
            if (each==element) {
                count++;
            }

        }
        return count;
    }

    public static int frequencyOfElement(char []array, char element){

        int count=0;
        for (char each : array) {

            if (each==element){
                count++;
            }

        }
        return count;
    }
    public static int frequencyOfElement(String[]array, String element){
        int count=0;
        for (String each : array) {
            if (each==element){
                count++;
            }

        }
        return count;
    }
}
/*
1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element.
			The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element.
			 The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element.
			The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element.
			The method returns the frequency of the given String element from the String array


 */