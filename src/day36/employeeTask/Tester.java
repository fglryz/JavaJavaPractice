package day36.employeeTask;

public class Tester extends Employee{


    public Tester(String name, char gender, int age, int id,String jobTitle, double salary) {
        super(name, gender, age, id,jobTitle , salary);

    }
    public void test(){
        System.out.println(jobTitle+" "+ name+ " is testing.");
    }
    public void createTicked(){
        System.out.println(jobTitle+ " "+name+" is creating ticked.");
    }

}
/*
2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()


 */