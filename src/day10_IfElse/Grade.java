package day10_IfElse;

public class Grade {

    public static void main(String[] args) {
        /*
        3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/
        char gr = 'B';
        String result = " ";

        if (gr >= 'A' && gr <= 'F'){

            if (gr ==  'A'){
                result = " Excellent";
            }
            else if (gr == 'B'){
                result = "Great job";
            }
            else if (gr == 'C'){
                result = "Good";
            }
            else if (gr == 'D'){
                result = "Passed";
            }
            else{
               result = "Failed";
            }

        }
        else {
            result = "Invalid";
        }
        System.out.println(result);


    }
}
