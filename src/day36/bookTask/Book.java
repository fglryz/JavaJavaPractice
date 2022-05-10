package day36.bookTask;

public class Book {

    private String title;
    private String type;
    private String author;
    private double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price<=0){
            System.err.println(price+ " is invalid price");
            System.exit(0);
        }
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price= £" + price +
                '}';
    }
}
/*
3. Book Task:
	3.1. create a class named Book:
			variables:
				title, type, author, price

			Methods:
				setInfo()
				toString()



 */