package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8_Grade {

    public static void main(String[] args) {

        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        for (Integer score : scores) {

            if(score>=0 &&score<=100) {
                if (score >= 90 && score <= 100) {
                    gradeOfA.add(score);

                } else if (score >= 80 && score < 90) {
                    gradeOfB.add(score);
                }
                else if (score>=70 && score < 80){
                    gradeOfC.add(score);

                }else if(score>=60 && score < 70){
                    gradeOfD.add(score);
                }else{
                    gradeOfF.add(score);
                }
            }else{
                System.out.println("Invalid entry");
            }
        }

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);
    }
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F

 */