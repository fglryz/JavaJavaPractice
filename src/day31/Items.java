package day31;

public class Items {

    public String name;
    public double unitPrice;
    public int quantity;

    public Items(String name, double unitPrice, int quantity) {
        this.name = name;

        if (unitPrice<=0) {
            System.out.println(unitPrice+ " is invalid");
        }
        this.unitPrice = unitPrice;

        if (quantity<=0){
            System.out.println(quantity+ " is invalid");
        }
        this.quantity = quantity;
    }
    public double calcCost(){
        return unitPrice * quantity;
    }

    public String
    toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()


 */