package Librarys;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {


    public static void main(String[] args) throws ParseException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        Author author1 = new Author(1, "Шекспир");
        Author author2 = new Author(2, "Агата  Кристи");
        Author author3 = new Author(3, " Сунь-Цзы");
        Author author4 = new Author(4, " Джоан Роулинг");

        Book book1 = new Book("Classic", 1, " Шекспир");
        Book book2 = new Book("Detective", 2, "  Сунь-Цзы");
        Book book3 = new Book("Historical", 3, " Агата  Кристи");
        Book book4 = new Book("Fantasy", 4, " Джоан Роулинг");

        Library library = new Library();

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.printAuthor(1);
        library.printAuthor(2);
        library.printAuthor(3);

        library.printBook(1);
        library.printBook(2);
        library.printBook(3);
        library.printBook(4);

        library.printAuthorBooks(1);
        library.printAuthorBooks(2);
        library.printAuthorBooks(3);

        library.removeAuthor(2);
        library.printAuthor(2);
        library.printAuthorBooks(2);

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = format.parse("30.03.2023");

        Person person = new Person(1, "bader");
        person.addBook(book1, format.parse("01.09.2023"));
        Person person2 = new Person(2, "");
        person.addBook(book2, format.parse("01.09.2023"));
        Person person3 = new Person(3, "");
        person.addBook(book3, format.parse("01.09.2023"));
        Person person4 = new Person(4, "");
        person.addBook(book4, format.parse("01.09.2023"));
        System.out.println();

    }
}
