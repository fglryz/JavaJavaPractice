package day38.employeeTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int id,  double salary, String companyName) {
        super(name, age, gender, id, "Tester", salary, companyName);
    }
    public void work(){
        System.out.println(jobTitle+ " "+ name+ " is testing");
    }
}
/*
2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

 */