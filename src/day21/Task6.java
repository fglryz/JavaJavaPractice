package day21;

public class Task6 {

    public static void main(String[] args) {

        String [] words = {"Python", "Java", "Java", "Python", "Java", "Python", "C#", "C#", "Python"};

        int count1 =0;
        int count2 =0;
        for (String each : words) {
            if (each.equals("Java")){
                count1++;
            }  if (each.equals("Python")) {
                count2++;

            }

        }

        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */