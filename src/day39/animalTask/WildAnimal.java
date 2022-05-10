package day39.animalTask;



public class WildAnimal extends Animal{

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String colour,
                      boolean isWild, boolean isFriendly, boolean playable) {
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
        this.isPlayable = playable;
    }

   public void hunt (){
       System.out.println(getName()+ " is hunting");
   }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating food");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name=" +getName() +
                ", breed=" +getBreed() +'\''+
                ", gender=" +getGender() +'\''+
                ", age=" +getAge() +'\''+
                ", size=" +getSize() +'\''+
                ", colour=" +getColour() +'\''+
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */