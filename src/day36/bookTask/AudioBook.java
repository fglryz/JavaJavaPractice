package day36.bookTask;

public class AudioBook extends Book{

    private String narrator;
    private int length;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);



    }


    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0)
            System.out.println(length+ " is invalid Entry");
        this.length = length;
    }
    public void listen(){
        System.out.println(getTitle()+ " is listened");
    }

    public String toString() {
        return "AudioBook{" +
                "narrator='" + narrator + '\'' +
                ", length=  hour(s)" + length +
                '}';
    }
}
/*
3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */