package day23;

public class DollarToLira {

    public static void main(String[] args) {

        dollarToLira(1000);

    }

    public static void dollarToLira(double amount){

        double total = amount * 14.84;

        System.out.println(total+"tl");
    }
}
