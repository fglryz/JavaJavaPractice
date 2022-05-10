package day39.animalTask;

public class FriendlyAnimal extends Animal {

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String colour,
                          boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, colour);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
        }





    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }
    public void play(){
        System.out.println(getName()+ " is playing");
    }
    public void pet(){
        System.out.println(getName()+ " is a pet");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating food");
    }

    public String toString() {
        return "FriendlyAnimal{" +
                "name=" +getName() +
                ", breed=" +getBreed() +'\''+
                ", gender=" +getGender() +'\''+
                ", age=" +getAge() +'\''+
                ", size=" +getSize() +'\''+
                ", colour=" +getColour() +'\''+
                ", isWild=" + isWild +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }


}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */