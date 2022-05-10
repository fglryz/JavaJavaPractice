package day44_abstraction.carTask;

public class Toyota extends Car{

    public Toyota(String made, String model, int year, double price, String color) {

        super(made, model, year, price, color);


    }

    @Override
    public void start() {
        System.out.println(getModel() + " turn the ignition");
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " driven by driver");
    }
}
