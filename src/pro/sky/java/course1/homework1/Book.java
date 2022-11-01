package pro.sky.java.course1.homework1;

public class Book {
    private final String name;
    private final Author author;
    private static int year;

    public Book (String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return year;
    }

    public void setYearPublishing(int year) {
        this.year = year;
    }

}
