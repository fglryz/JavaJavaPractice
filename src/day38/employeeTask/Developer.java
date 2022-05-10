package day38.employeeTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Developer", salary, companyName);
    }
    public void work(){
        System.out.println(jobTitle+ " "+ name+ " is coding and fixing bugs");
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