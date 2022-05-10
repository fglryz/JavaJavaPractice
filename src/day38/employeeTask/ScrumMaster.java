package day38.employeeTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(jobTitle+ " "+name+ "is arranging meeting");
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