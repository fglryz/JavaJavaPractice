package day31;

public class TestSalary {

    public static void main(String[] args) {

        SalaryCalculator obj = new SalaryCalculator(35, 0.05,40, 0.20 );

        System.out.println(obj.calculateSalary());
        System.out.println(obj.stateTax());
        System.out.println(obj.federalTax());
        System.out.println(obj.totalTax());
        System.out.println(obj.salaryAfterTax());


    }
}


