package pro.sky.java.course1.homework2;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private static int publishYear;

    public Book (String name, Author author, int year) {
        this.bookName = name;
        this.author = author;
        this.publishYear = year;
    }

    public String getNameBook() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return publishYear;
    }

    public void setYearPublishing(int year) {
        this.publishYear = year;
    }

    @Override
    public String toString() {
        return getNameBook() + ". Published in " + getYearPublishing() + ". ";
    }
    @Override
    public boolean equals (Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishYear);
    }
}
