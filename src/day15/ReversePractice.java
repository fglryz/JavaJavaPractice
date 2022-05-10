package day15;

public class ReversePractice {

    public static void main(String[] args) {


        String word = "Java";

        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            result += word.charAt(i);


        }System.out.print(result);


        System.out.println("---------------------------");

        String str = "Selma Koklu";

        String result2 = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            result2 += str.charAt(i);


        }
        System.out.println(result2);
    }
}

