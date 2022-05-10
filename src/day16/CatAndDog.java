package day16;

public class CatAndDog {

    public static void main(String[] args) {
        String catDog = "Cat cat caT CAt cat CAT dog DOG DOg dog dog doG ";
        int cat =0;
        int dog =0;

        for (int i = 0; i < catDog.length()-3; i++) {
            String s = catDog.substring(i, i+3);
        if (s.equalsIgnoreCase("cat")){
            cat++;
        }if (s.equalsIgnoreCase ("dog")){
            dog++;
        }
        }
        boolean result = cat == dog;

        System.out.println(result);

    }
}
/*
5. write a program to print true if the string "cat" and(+) "dog" appear the same number of times
in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */