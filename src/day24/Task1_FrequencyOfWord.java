package day24;

public class Task1_FrequencyOfWord {

    public static void main(String[] args) {



        System.out.println(frequencyOfWord("java, java, java, java,java, java,python, python, C#", "java"));

    }

    public static int frequencyOfWord(String sentence, String word) {

       int count =0;
     while (sentence.contains(word)){
           sentence = sentence.replaceFirst(word,"");
           count++;
       }
        System.out.println();
       return  count;
    }
}
/*
public static int frequencyOfWord(String sentence, String word){
    int count = 0;
    while(sentence.contains(word)){
        sentence = sentence.replaceFirst(word, "");
        count++;
    }
    return count;
   */