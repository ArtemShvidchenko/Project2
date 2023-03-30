package Librarys;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author(1, "name");
        Author author2 = new Author(2, "name");
        Author author3 = new Author(3, "name");

        Book book1 = new Book("Classic", 1, " name author");
        Book book2 = new Book("Historical", 2, " name author");
        Book book3 = new Book("Detective", 3, " name author");
        Book book4 = new Book("Fantasy", 4, " name author");

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

    }

}
