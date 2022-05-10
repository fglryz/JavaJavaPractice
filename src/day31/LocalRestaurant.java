package day31;

public class LocalRestaurant {

    public static void main(String[] args) {


        Server []servers ={ new Server("Jane",32,12.5,true),
                            new Server("hande",33,13.0,false),
                            new Server("Sarah",34,12.75,true)};

        Chef[]chefs = {new Chef("Rose",35,20.0,true),
                      new Chef("Ali",37, 25.5,true),
                        new Chef("Selma",38, 30.0,true)};


        Restaurant restaurant = new Restaurant("Said","Mc Clean",5);
        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        System.out.println(restaurant);

    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */