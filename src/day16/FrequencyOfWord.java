package day16;

public class FrequencyOfWord {

    public static void main(String[] args) {


        String str = "NamesNamesNamesNamesNamesNamesNamesNamesNamesNamesNamesNames";

        int frequency = 0;

        for (int i = 0; i <= str.length()-5 ; i++) {
        String eachSub = str.substring(i, i+5);

        if (eachSub.equals("Names")){
           frequency+=1;
            }


        }
        System.out.println(frequency);
    }
}
