package day27;

import java.util.Arrays;

public class Task1_Insert {

    public static void main(String[] args) {

        int []num={10, 20, 30, 40, 50, 60, 70};
      int []newNum =  insert(num,1,100);
        System.out.println(Arrays.toString(newNum));

        double [] num2 ={1.2, 2.3, 3.4, 4.5, 5.6, 6.7};
        num2= insert(num2,0,100.5);
        System.out.println(Arrays.toString(num2));

        char []ch ={'A', 'B', 'C', 'D', 'F'};
        ch=insert(ch,2, 'X');
        System.out.println(Arrays.toString(ch));

        String[]str = {"Java", "Python", "C€", "Dax", "Box"};
        str= insert(str, 4,"Selma");
        System.out.println(Arrays.toString(str));

    }

    public static int [] insert(int[]array, int index, int newElement){

        if (index<0 || index>=array.length){
            System.err.println(index + " Invalid index");
            System.exit(0);
        }

       array[index] = newElement;
        return array;
    }

    public static double []insert (double[]array, int index, double newElement){

        if (index<0 || index>=array.length) {
            System.err.println(index + " Invalid index");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static char[]insert(char[]array,int index, char newElement){

        if (index<0 || index>=array.length) {
            System.err.println(index + " Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;
    }

    public static String[]insert(String[]array, int index, String newElement){

        if (index<0 || index>=array.length) {
            System.err.println(index + " Invalid index");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
}
/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array


 */