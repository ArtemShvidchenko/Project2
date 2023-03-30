package Librarys;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
    ArrayList<Author> authors = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void removeAuthor(int id) {
        for (Author author : authors) {
            if (author.id == id) {
                authors.remove(author);
                return;
            }
        }

        System.out.println("Author with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public short printAuthor(int id) {
        for (Author author : authors) {
            if (author.id == id) {
                System.out.println("Author with id " + id + " info.");
                System.out.println("Name: " + author.name);

                System.out.println("----------------------");
                return 0;
            }
        }

        System.out.println("Author with id " + id + " is not found!");
        System.out.println("----------------------");
        return 0;
    }

    public short printAuthorBooks(int id) {
        boolean isAuthorExist = false;
        String authorName = "";

        for (Author author : authors) {
            if (author.id == id) {
                isAuthorExist = true;
                authorName = author.name;
                break;
            }
        }

        if (!isAuthorExist) {
            System.out.println("Author with id " + id + " is not found!");
            System.out.println("----------------------");
            return 0;
        }

        System.out.println("Books of author " + authorName + ":");

        for (Book book : books) {
            if (book.id == id) {
                System.out.println("- " + book.genre);
            }
        }
        System.out.println("----------------------");
        return 0;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                books.remove(book);
                return;
            }
        }

        System.out.println("Book with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    public short printBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                System.out.println("Book with id " + id + " info.");
                System.out.println("Genre: " + book.genre);
                System.out.println("Version: " + book.version);
                System.out.println("Author: " + book.author);
                System.out.println("----------------------");
                return 0;
            }
        }

        System.out.println("Book with id " + id + " is not found!");
        System.out.println("----------------------");
        return 0;
    }

    public Collection<Object> getAuthors() {
        return null;
    }

    public Collection<Object> getBooks() {
        return null;
    }
}


