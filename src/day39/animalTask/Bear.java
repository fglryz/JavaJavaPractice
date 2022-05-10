package day39.animalTask;

public class Bear extends WildAnimal{


    public Bear(String name, String breed, char gender, int age, String size, String colour, boolean isWild, boolean isFriendly, boolean playable) {
        super(name, breed, gender, age, size, colour, isWild, isFriendly, playable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting fish");
    }
}
