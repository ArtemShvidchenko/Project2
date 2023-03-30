package Librarys;



public class Book {

    int id;
    String genre;
    int version;
    String author;

    private static int idIncrementer = 0;

    public Book(String genre, int version, String author) {
        idIncrementer++;
        this.id = idIncrementer;
        this.genre = genre;
        this.version = version;
        this.author = author;
    }
}





