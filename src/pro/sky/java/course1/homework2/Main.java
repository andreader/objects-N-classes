package pro.sky.java.course1.homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println("level easy");
        Author pete = new Author("Pete", "Pearson");
        Author lewis = new Author("Clive Staples", "Lewis");
        Book narnia = new Book("The Chronicles of Narnia", lewis, 1950);
        Book english = new Book("New English for beginners", pete, 2022);
        narnia.setYearPublishing(2006);
        System.out.print(narnia);
        System.out.println(lewis);
        System.out.print(english);
        System.out.println(pete);

    }
}
