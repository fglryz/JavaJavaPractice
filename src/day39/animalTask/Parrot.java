package day39.animalTask;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, char gender, int age, String size, String colour, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, colour, isWild, isFriendly, isPlayable);
    }
    public void fly(){
        System.out.println(getName()+ " is flying");
    }
    public void sing(){
        System.out.println(getName()+ " is singing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating seeds");
    }
}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()
 */