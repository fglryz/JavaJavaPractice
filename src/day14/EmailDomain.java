package day14;

public class EmailDomain {

    public static void main(String[] args) {

        String str = "email = Cydeo.School@gmail.com";

        int beginningIndex = str.indexOf("@")+1;
        int endingIndex = str.lastIndexOf(".");
        String domain = str.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);


        System.out.println("------------------------");

        String email = "School.Cydeo@yahoo.com";

        int beginningIndex2 = email.indexOf("@")+1;
        int endingIndex2 = email.lastIndexOf(".");
        String domain2 = email.substring(beginningIndex2, endingIndex2);
        System.out.println("domain2 = " + domain2);
    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo

 */