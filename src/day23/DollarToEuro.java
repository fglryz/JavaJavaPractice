package day23;

public class DollarToEuro {

    public static void main(String[] args) {

        dollarToEuro(1000);

    }
    public static void dollarToEuro (double amount){

        double total = amount * 0.93;
        System.out.println(total+" Euro");
    }
}
