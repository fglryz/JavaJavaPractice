package day39.animalTask;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, char gender, int age, String size, String colour, boolean isWild, boolean isFriendly, boolean playable) {
        super(name, breed, gender, age, size, colour, isWild, isFriendly, playable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }
}
/*
5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile

 */