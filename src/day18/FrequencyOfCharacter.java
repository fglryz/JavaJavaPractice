package day18;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String word = "AAABBBBCCCCCCCAAAACDD";
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int count =0;

            for (int j = 0; j <word.length() ; j++) {
                char eachChar = word.charAt(j);

                if (ch == eachChar){
                    count++;
                }

            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;
        }
        System.out.println(result);
            }

        }



/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */