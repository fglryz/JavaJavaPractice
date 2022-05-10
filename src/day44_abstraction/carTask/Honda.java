package day44_abstraction.carTask;

public class Honda extends Car{
    public Honda(String made, String model, int year, double price, String color) {
        super(made, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " push the start button");
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " driven manually");
    }
}
