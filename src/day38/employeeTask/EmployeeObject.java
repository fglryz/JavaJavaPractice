package day38.employeeTask;

public class EmployeeObject {

    public static void main(String[] args) {

        Tester tester1 =new Tester("Hannah",32,'F', 123,110000 ,"Cydeo");

        Developer developer1 =new Developer("Doroty", 23,'F',124, 125000,"Amazon");

        ProductOwner PO1 = new ProductOwner("Ali", 29, 'M', 125, "Product Owner",115000,"BM");

        ScrumMaster scrumMaster= new ScrumMaster("Michel", 46, 'M', 127, "SM",118000,"Amazon");

        Teacher teacher =new Teacher("Merve", 24, 'F', 128, "Teacher",
                67000,"London School");

        Driver driver= new Driver("Sami", 32, 'M', 129, "Driver", 45000, "Mass Hotel");

        Pilot pilot = new Pilot("Mete", 43, 'M', 130, "Pilot", 150000,"FunAir");

        tester1.work();

        developer1.work();

        PO1.work();

        scrumMaster.work();

        teacher.work();

        driver.work();

        pilot.work();

    }
}
