package day36.employeeTask;

public class Teacher extends Employee{


    public Teacher(String name, char gender, int age, int id,String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void teach(){
        System.out.println(jobTitle+ " "+name+ " is teaching.");
    }
}
/*
2.4 Create the sub class of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()


 */