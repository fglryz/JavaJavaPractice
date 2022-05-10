package day20_Arrays;

import java.util.Arrays;

public class Task3_ShoppingList {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

       int indexNumberOfGlove = -1;
       boolean hasIPad = false;
       String report = "";

        for (int i = 0; i < items.length; i++) {

            String item =items[i];
            double price = prices[i];
            int id = itemIDs[i];

            if (item.equals("Gloves")){
              indexNumberOfGlove = i ;
            }
            if (item.equals("IPad")){
                hasIPad = true;
            }
            System.out.println(item+" - "+price+" - "+ id);
        }

        System.out.println("indexNumberOfGlove = " + indexNumberOfGlove);
        System.out.println("hasIPad = " + hasIPad);

        //String initial = each.charAt(0)+ "."+each.charAt(each.indexOf(" ")+1);


    }
}
/*


3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID


 */