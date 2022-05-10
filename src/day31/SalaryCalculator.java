package day31;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public int weeklyHours;
    public  double federalTaxRate;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, int weeklyHours, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.weeklyHours = weeklyHours;
        this.federalTaxRate = federalTaxRate;
    }

    public double calculateSalary(){

        return hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){

        return calculateSalary()* stateTaxRate;
    }
    public double federalTax(){

        return calculateSalary()* federalTaxRate;
    }
    public double totalTax(){

        return  stateTax() + federalTax();
    }
    public double salaryAfterTax (){
        return calculateSalary()-totalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }
}

/*
public double calcArea(){
      double  calcArea= (pi * radius*radius);
      return calcArea;//


1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */