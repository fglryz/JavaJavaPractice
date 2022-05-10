package day28;

import java.util.ArrayList;

public class Task4_Combine {

    public static void main(String[] args) {


        String []str1 = {"A", "B", "C", "D"};
        String []str2={"X", "Y", "Z"};

        ArrayList<String>list= new ArrayList<>();

        for (String each : str1) {
          list.add(each);

        }
        for (String each : str2) {
            list.add(each);

        }
        System.out.println(list);
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */