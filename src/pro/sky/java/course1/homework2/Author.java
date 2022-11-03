package pro.sky.java.course1.homework2;

import java.util.Objects;

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

    @Override
    public String toString() {
        return " Written by " + getNameAuthor() + " " + getSurnameAuthor() + ".";
    }

    @Override
    public boolean equals (Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
        }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

