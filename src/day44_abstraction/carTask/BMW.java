package day44_abstraction.carTask;

public class BMW extends Car{


    public BMW(String made, String model, int year, double price, String color) {
        super(made, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel()+" say \"Start\"");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" automatic drive");

    }
}
