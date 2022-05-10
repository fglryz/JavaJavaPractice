package day44_abstraction.carTask;

public abstract class Car {

    private final String made;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String made, String model, int year, double price, String color) {

        if (made.equals("") || made==null){
            throw new RuntimeException(made+ " is invalid entry");
        }
        this.made = made;

        if (model.equals("")||model==null){
            throw new RuntimeException(model+" is invalid entry");
        }
        this.model = model;

        if (year<1886){
            throw new RuntimeException(year+" is invalid entry");
        }
        this.year = year;
       setPrice(price);
        setColor(color);
    }

    public String getMade() {
        return made;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException(price+" is invalid entry");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("") || color==null){
            throw new RuntimeException(color + " is invalid entry");
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public  void stop(){
        System.out.println(model+ " push the brake");
    }

    public String toString() {
        return "Car{" +
                "made='" + made + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes


 */