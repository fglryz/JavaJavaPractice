package day38.animalTask;

public class AnimalObject {

    public static void main(String[] args) {


        Cat cat1 =new Cat("Tobby", "Tekir",1,'M',"Small","White");

        Dog dog1 = new Dog("Sammy","Kangal", 2,'F', "Large","Ginger");

        Tiger tiger1 = new Tiger("Hunter", "Asia", 5, 'M', "Medium","Black");

        Eagle eagle= new Eagle("Chunky", "Syberia", 4, 'F', "Large","Black");

        cat1.eat();

        dog1.eat();

        tiger1.eat();

        eagle.eat();
    }
}
