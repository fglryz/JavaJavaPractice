package day09;

public class MinimumNumber {

    public static void main(String[] args) {

        int n1 = 300;
        int n2 = 322;
        boolean equal = n1 == n2;
        if (n1 < n2) {
            System.out.println(n1 + " is smaller ");
        }
        if (n2 < n1){
            System.out.println(n2 + " is smaller");
        }

        if (equal){
            System.out.println("Equal");

        }
    }

}
