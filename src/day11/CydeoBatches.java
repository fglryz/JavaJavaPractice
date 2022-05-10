package day11;

public class CydeoBatches {

    public static void main(String[] args) {

        String batch = "EU";
        String result = " ";

        if (batch=="EU"||batch =="US morning" ||batch=="US evening"){

            if (batch=="EU"){
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        }
        else if (batch == "US morning"){
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
        }else {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        }

        }else{
        System.out.println("Invalid Batch");
    }


        System.out.println("--------------------------------------");

        String batch2 = "US morning";
        String result2 = " ";

       if (batch2=="EU"||batch2 =="US morning" ||batch2=="US evening"){
           switch (batch2){

               case "EU":
                   result2 = "Class times are  10-5 EST. M, T, W, Th, F.";
                   break;
               case "US morning":
                   result2 = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
               case "US evening":
                   result = "Class times are 7-10 EST. M, T, W, Th, S, S";

           }
       }else {
           result2 = "Invalid Batch";
       }
        System.out.println(result2);


        System.out.println("-------------------------------------------------");

        String batch3 = "US evening";
        String result3 = " ";


        switch (batch3){
            case "EU":
                result3 = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            case "US morning":
                result3 = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            default:
                result3 = "Class times are 7-10 EST. M, T, W, Th, S, S";


        }
        System.out.println(result3);

    }
}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


 */