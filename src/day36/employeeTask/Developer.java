package day36.employeeTask;

public class Developer extends Employee {


    public Developer(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);


    }
    public void code(){
        System.out.println(jobTitle+ " "+ name+" is working");
    }
    public void fix(){
        System.out.println(jobTitle+ " "+ name+ " is fixing bugs");
    }
}
/*
2.3(+) Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */