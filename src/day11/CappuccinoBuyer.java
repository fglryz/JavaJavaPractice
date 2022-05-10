package day11;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "tall";


        if (size == "tall" || size == "grande" || size == "venti") {

            if (size == "tall") {
                System.out.println("Price is $3.69 \n 90 calories");
            } else if (size == "grande") {
                System.out.println("Price is $3.99 \n 120 calories");
            } else {
                System.out.println("Price is $4.29 \n 150 calories");
            }

        } else {
            System.out.println("Invalid");
        }
        System.out.println("---------------------------------------");


        String size2 = "venti";
        String result = " ";

        if (size2 == "tall" || size2 == "grande" || size2 == "venti"){

            switch (size2){
                case "tall":
                    System.out.println("Price is $3.69 \n 90 calories");
                    break;
                case "grande":
                    System.out.println("Price is $3.99 \n 120 calories");
                    break;
                default:
                    System.out.println("Price is $4.29 \n 150 calories");
                    break;

            }

        }else{
            System.out.println("invalid");
        }

        System.out.println("--------------------------------------------");

        String sz3 = "grande";
        String result2 =" ";

        switch (sz3){
            case "tall":
                result2= "Price is $3.69 \n 90 calories";
                break;
            case "grande":
                result2= "Price is $3.99 \n 120 calories";
                break;
            case "venti":
                result2= "Price is $4.29 \n 150 calories";
                break;

                default:
                result2 = "Invalid";

        }
        System.out.println(result2);


    }
}

/*
        int number = 13;

        String result = " ";

        switch (number){
            case 1:
                System.out.println("January");
                break;



/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that
can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories
If the size is invalid then the output should be "Invalid Size"
			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */