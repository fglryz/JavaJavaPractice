package day10_IfElse;

public class GradeLevel {

    public static void main(String[] args) {


        /*
        1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which
        school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

         */

        int stud = 34;
       String  grade = " ";

        if (stud >=1 && stud <=18){

        if (stud >= 1 && stud <= 5){
            grade = "Elementery School";
        }else if (stud >=6 && stud <= 8){
          grade = "Middle School";
        }
        else if (stud >=9 && stud <= 12){
            grade = "High School";
        }
        else if (stud >=13 && stud <= 16){
            grade = "College";
        }else {
            grade = "Grad School";
        }


    }else {
           grade = "Invalid";
        }
        System.out.println(grade);
    }
}
