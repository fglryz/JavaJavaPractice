package day16;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AAAABBBBCCCAAAAAAAAADD";
        char ch = 'A';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if (ch == eachChar){
                frequency++;

            }

        }
        System.out.println(frequency);

        System.out.println("------------------------------");


        String str2 = "Java is a programming language";
        char ch2 = 'a';

        int frequency2 = 0;

        for (int i = 0; i < str2.length() ; i++) {
            char eachChar2 = str2.charAt(i);

            if (ch2 == eachChar2){
                frequency2++;

            }

        }

        System.out.println(frequency2);
    }
}
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */