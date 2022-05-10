package day36.bookTask;

public class EBook extends Book{



    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);

    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equals("Large") || size.equals("Medium") || size.equals("Small"))){
            System.out.println(size+ " is invalid");
            System.exit(0);
        }
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {

        if (pages <=0){
            System.out.println(pages+ " is invalid entry");
        }
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("reading "+getTitle());
    }

    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()


 */