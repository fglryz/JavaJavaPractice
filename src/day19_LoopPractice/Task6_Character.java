package day19_LoopPractice;

public class Task6_Character {

    public static void main(String[] args) {

        String str = "aaabbbcccd";
        String result ="";
        int highestFre = 0;

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

                for (int i = 0; i <str.length() ; i++) {
                    char eachChar = str.charAt(i);

                    if (ch == eachChar) {
                        frequency++;
                    }

                }


                if (frequency > highestFre){
                    highestFre = frequency;
                }



        }

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
           char eachChar = str.charAt(i);

            if (ch == eachChar) {
                frequency++;



            }

            }

        if (frequency == highestFre && !result.contains(ch+"")){
            result +=ch;
        }

        }





        System.out.println(result);




    }
}
//6.  Write a program that can find the character that has the highest frequency from a string