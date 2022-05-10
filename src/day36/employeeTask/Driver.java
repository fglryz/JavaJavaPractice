package day36.employeeTask;

public class Driver extends Employee{


    public Driver(String name, char gender, int age, int id,String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void drive(){
        System.out.println(jobTitle+ " "+name+" is driving.");
    }
}
/*
2.6 Create the sub class of Employee named Driver:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				drivering()
				toString()

 */