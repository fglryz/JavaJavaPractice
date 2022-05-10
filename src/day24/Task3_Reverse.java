package day24;

public class Task3_Reverse {

    public static void main(String[] args) {


        System.out.println(reverse("Java"));
    }

    public static String reverse(String word){

       String result = "";

        for (int i = word.length()-1; i >=0; i--) {

            result+=word.charAt(i);

            }
return result;
        }
    }

