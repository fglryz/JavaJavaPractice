package day23;

public class Grade {

    public static void main(String[] args) {

        grade(89);

    }
   public static void grade (int score){

        String result ="";
        if (score <0 && score>100){
            result= "Invalid";

        }else {
            if (score >=90){
                result ="A";
            }else if (score >=80){
                result ="B";
            }else if (score >=70){
                result ="C";
            }else if (score >=60){
                result ="D";
            }else {
                result = "F";
            }
            System.out.println("Your grade is: "+result);
        }
   }

}
/*
5. create a method that can calculate the grade of the student based on the score
 */