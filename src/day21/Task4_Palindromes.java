package day21;

public class Task4_Palindromes {

    public static void main(String[] args) {

        String[] str = {"Civic", "Java", "Level", "whole", "Anna", "name"};

       int count = 0;

        for (String each : str) {
            String reverse = "";

            for (int i = each.length() -1; i >=0; i--){
                reverse+= each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)){
                count++;
            }

        }
        System.out.println(count);

    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */