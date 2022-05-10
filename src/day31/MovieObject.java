package day31;

public class MovieObject {

    public static void main(String[] args) {


        String genre = "Adventure, Comedy, Thriller";
        String title = " Journey to SDET: Cydeo Batch EU*";
        String []casts ={"Selma", "Mali", "Ismali"," Rum"};

        Movie movie1 = new Movie("US","Life is Beautiful", "Thriller/Drama",
                "10/05/2022","Anthony C \n");
        movie1.addCasts(casts);
        System.out.println(movie1);


    }
}
