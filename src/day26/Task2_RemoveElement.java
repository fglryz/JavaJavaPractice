package day26;

import java.util.Arrays;

public class Task2_RemoveElement {
    public static void main(String[] args) {

        int []num ={10,20,30,40,50,60};
        int []newNum=removeElements(num,2);
        System.out.println(Arrays.toString(newNum));

        System.out.println("------------------------------------------------");

        double []dbl = {1.2, 1.2, 3.4, 4.5, 5.6, 5.6, 6.3, 8.9, 5.6, 5.6};
        double[]newDbl=removeElements(dbl,6);
        System.out.println(Arrays.toString(newDbl));

        System.out.println("------------------------------------------------");

        char[]chars={'a', 'b', 'c', 'a', 'b', 'a', 'd', 'e', 'a', 'e'};
        char[]newChars=removeElements(chars,4);
        System.out.println(Arrays.toString(newChars));

        System.out.println("------------------------------------------------");

        String []str = {"Python", "Java", "C#", "C#", "Java", "Java", "Java", "C++", "C++"};
        String[]newStr= removeElements(str,5);
        System.out.println(Arrays.toString(newStr));
    }

    public static int[]removeElements(int[]array, int index){

        if (index <0 ||index>array.length-1){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int result[]= new int[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }

    public static double [] removeElements(double[]array,int index){

        if (index<0 ||index>array.length-1){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        double[]result=new double[array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            result [j++]=array[i];


        }
        return result;

    }

    public static char[]removeElements(char[]array,int index){
        if (index<0||index> array.length-1){
            System.err.println("InvalidEntry");
            System.exit(0);
        }
        char []result= new char[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i==index){
                continue;
            }
            result[j++]=array[i];


        }
        return result;
    }

    public static String[]removeElements (String[]array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        String []result=new String[array.length-1];
        int j=0;

        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];


        }
        return result;
    }
}

/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index.
			 the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index.
			the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index.
			the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index.
			the method removes the element at the given index of the array and returns the new array

 */
