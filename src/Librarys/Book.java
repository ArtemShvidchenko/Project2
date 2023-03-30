package Librarys;

import java.util.HashMap;
import java.util.Map;

public class Book {
    //public static void main(String[] args) {
    // enum Genres{
    // DRAMA,
    //FANTASY,
    //CLASSIC,
    //HISTORICAL,
    //DETECTIVE
    public static void main(String[] args) {


        Map<String, String> books = new HashMap<>();
        books.put("Шекспир","Ромео и Джульетта");
        books.put("","Fantasy");
        books.put("Братья Карамазовы","Достоевский");
        books.put("Сунь-Цзы","Искусство воины");
        books.put("Агата Кристи","Приключения Пуаро");

    }
        //}
        int id;
        String genre;
        int version;
        String author;

        private static int idIncrementer = 0;

    public Book(String genre, int version, String author){
            idIncrementer++;
            this.id = idIncrementer;
            this.genre = genre;
            this.version = version;
            this.author = author;
        }
    }





