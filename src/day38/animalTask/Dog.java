package day38.animalTask;

public class Dog extends Animal{


    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void eat(){
        System.out.println("eats dog food");
    }
}
/*
2. Dog
					eat(): eats dog food



 */