package day39.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Simba","kangal",'M',4,"Large",
                "White",false,true,true);
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        
        Cat cat1 =new Cat("Toby","Tekir",'M',1,"Small",
                "White",false,true,true);
        cat1.eat();
        cat1.drink();
        cat1.sleep();
        
        Dolphin dolphin1 = new Dolphin("Jasper","Osian", 'F', 6, "Large", 
                "Grey",false,true,true);
        dolphin1.eat();
        dolphin1.drink();
        dolphin1.sleep();
        
        Parrot parrot1 = new Parrot("Funny","bengal", 'F', 2,"Small", 
                "green",false,true,true);
        parrot1.eat();
        parrot1.drink();
        parrot1.sleep();
        
        Tiger tiger1 = new Tiger("Cayle","Bengal",'M', 8,"medium",
                "Brawn",true,false,false);
        tiger1.hunt();
        
        Lion lion1 = new Lion("Angry","Africa", 'M',5,"Large",
                "Black",true,false,false);
        lion1.hunt();
        
        Bear bear1 =new Bear("Lazy", "Pole",'F', 1,"Large",
                "White",true,false,false);
        bear1.hunt();
        
        Crocodile crocodile= new Crocodile("Hunter","Nile",'M',11,"Large",
                "Grey",true,false,false);
        crocodile.hunt();

        Python python1 =new Python("Danger","Amazon",'F',6,"Large",
                "Brown",true,false,false);
        python1.hunt();
        System.out.println(python1);
        python1.setAge(2);
        System.out.println(python1.getAge());
        System.out.println(python1);


        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(dolphin1);
        System.out.println(parrot1);
        System.out.println(lion1);
        System.out.println(tiger1);
        System.out.println(bear1);
        System.out.println(crocodile);


    }
}
/*
6. Create a class named Zoo:
			Create the objects of each sub classes and 

			test all the functions of each objects

            Analyze the relationships between the classes 

 */