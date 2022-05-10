package day08;

public class SchoolType {

    public static void main(String[] args) {

        byte age = 12;

        boolean a = age >= 1 && age <=5;
        boolean b = age >=6 && age <= 8;
        boolean c = age >=9 && age <=12;
        boolean d = age >= 13 && age <= 16;
        boolean e = age >=17 && age <=18;

        if (a){
            System.out.println("Elementary School");
        }

        if (b){
            System.out.println("Middle School");
        }

        if (c){
            System.out.println("High School");
        }

        if (d){
            System.out.println("College");
        }

        if (e) {
            System.out.println("Grade School");
        }



    }
}

/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18

 */