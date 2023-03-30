package Librarys;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {
    int id;
    String name;
    Map<Book, Date> books = new HashMap<>();


    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addBook(Book book, Date date){



    }

}

