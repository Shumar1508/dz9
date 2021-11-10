package ru.skypro.homework9;

public class Main {

    public static void main(String[] args) {
        book();
        Author();

    }

    public static void book() {
        Book book = new Book("It", "author", 1986);
        System.out.println("book = " + book.getTitle());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());
        book.setYearOfPublication(1987);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
    }

    public static void Author() {
        Author author = new Author("Stephen King");
        System.out.println("author.name = " + author.getName());
    }
    }