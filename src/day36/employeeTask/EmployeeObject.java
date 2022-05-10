package day36.employeeTask;

import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Ayse", 'F', 24, 32, "SDET", 120000);
        tester1.work();
        tester1.test();

        Tester tester2 = new Tester("Selma", 'F', 48, 34, "QA", 110000);
        tester2.work();
        tester2.test();

        Developer developer1 = new Developer("Mali", 'M', 28, 33, "Developer", 145000);
        developer1.work();
        developer1.fix();
        developer1.code();

        Developer developer2 = new Developer("Ismail", 'M', 50, 35, "Developer", 140000);
        developer2.work();
        developer2.fix();
        developer2.code();

        Teacher teacher = new Teacher("Jane", 'F', 34, 21, "Teacher", 60000);
        teacher.work();
        teacher.teach();

        Driver driver = new Driver("Adam", 'M', 28, 21, "Driver", 25000);
        driver.work();
        driver.drive();
        Tester[] testers = {tester1, tester2};

        Developer[] developers = {developer1, developer2};

        System.out.println(Arrays.toString(testers));
        System.out.println(Arrays.toString(developers));
        System.out.println(teacher);
        System.out.println(driver);


    }
}
//2.7 Create a class named Employee Objects and test of the sub class' objects