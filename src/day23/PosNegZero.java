package day23;

public class PosNegZero {

    public static void main(String[] args) {

        posNegZero(-13);
    }
    public static void posNegZero (int num){

        if (num > 0){
            System.out.println(num+ " is positive Number");
        }else if (num < 0 ){
            System.out.println(num+" is negative number ");
        }else if (num == 0 ){
            System.out.println("number is zero");
        }
        System.out.println();
    }
}
