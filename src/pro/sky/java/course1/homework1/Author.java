package pro.sky.java.course1.homework1;

public class Author {
    private final String name;
    private final String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getNameAuthor() {
        return name;
    }

    public String getSurnameAuthor() {
        return surname;
    }
}
