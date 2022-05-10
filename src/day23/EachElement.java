package day23;

public class EachElement {
    public static void main(String[] args) {
        eachElement();
    }

    public static void eachElement() {
        int [] numbers = {1,2,3,4,5,6};
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
