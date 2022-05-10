package day09;

public class CalculateSalary {

    public static void main(String[] args) {

        int salary = 125000;
        boolean isMarried = true;

        double taxRate = 0;


        if(salary >= 130000 && isMarried ==true){
            System.out.println(salary- (salary * 30 /100.0));
        }
        else if (salary>= 130000 && isMarried == false){
            System.out.println(salary - (salary * 35 / 100.0));
        }
        else if (salary >= 100000 && salary < 130000 && isMarried == true){
            System.out.println(salary - (salary * 25 / 100.0));
        }
        else if (salary >= 100000 && salary < 130000 && isMarried == false){
            System.out.println(salary - (salary * 30 / 100.0));
        }
        else if (salary >= 80000 && salary < 100000 && isMarried == true){
            System.out.println(salary - (salary * 20 / 100.0));
        }
        else if (salary >= 80000 && salary < 100000 && isMarried == false){
            System.out.println(salary - (salary * 25 / 100.0));
        }
        else if (salary < 80000 && isMarried == true){
            System.out.println(salary -(salary * 15 / 100.0));
        }
        else {
            System.out.println(salary -(salary * 20 / 100.0));
        }

        System.out.println("-------------OR----------------");



        if (salary >= 130000){  //false: salary < 130000
            taxRate = 0.35;
        }else if (salary>=100000){  //false: salary < 100000
           taxRate = 0.30;
        }
        else if (salary >= 80000){   //false: salary <80000
            taxRate = 0.25;
        }
        else{
            taxRate = 0.20;
        }
        if (isMarried){   //if the person is married
            taxRate -= 0.05;  //Subtracting 5% from the original tax rate
        }
     double salaryAfterTax = salary- (salary*taxRate);
        System.out.println("Salary after tax = "+salaryAfterTax);
    }
}

/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

 */