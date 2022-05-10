package day39.animalTask;

public class Dog extends FriendlyAnimal{


    public Dog(String name, String breed, char gender, int age, String size, String colour, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, colour, isWild, isFriendly, isPlayable);
    }
    public void bark(){
        System.out.println(getName()+ " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eating dog food");
    }
}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()


 */