package day39.animalTask;

public class Dolphin extends FriendlyAnimal{


    public Dolphin(String name, String breed, char gender, int age, String size, String colour, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, colour, isWild, isFriendly, isPlayable);
    }
    public void swim(){
        System.out.println(getName()+ " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating fish");
    }
}
/*
3. Dolphin:
					Extra methods:
						swim()


 */