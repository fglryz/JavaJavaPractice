package day23;

public class EachChar {

    public static void main(String[] args) {

       printEachC();
    }
    public static void printEachC (){

        String str ="aaaabbbbccccddeeee";

        char chr = str.charAt(0);

        for (int i = 0; i <str.length() ; i++) {
           chr =str.charAt(i);
            System.out.print( str.charAt(i)+" ");

        }
        System.out.println();
    }

}
//13. create a method named printEachChar that can print each characters of a string