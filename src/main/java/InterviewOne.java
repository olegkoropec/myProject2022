import java.util.*;


public class InterviewOne {
    public static void main(String[] args) {

        Author hemenguey = new Author("Hemenguey", 45);
        Author shevchenko = new Author("Shevchenko", 40);
        Author kostenko = new Author("Kostenko", 85);

        List<Author> authors = new ArrayList<>();
        authors.add(hemenguey);
        authors.add(shevchenko);
        authors.add(kostenko);
        System.out.println("authors: " + authors);

        Book kobzar = new Book("Kobzar", Arrays.asList(shevchenko, kostenko));
        Book oldManAndSea = new Book("OldManAndSea", Arrays.asList(hemenguey, shevchenko));

        List<Book> books = new ArrayList<>();

        books.add(kobzar);
        books.add(oldManAndSea);
        System.out.println(books);

        System.out.println(Arrays.asList(hemenguey.getName(), kostenko.name, shevchenko.name));
        System.out.println(kobzar.getName() + " NAME " + oldManAndSea.name);

        List<String> name = new ArrayList<>();
        name.add(shevchenko.name);
        name.add(hemenguey.name);
        name.add(kostenko.name);
        Collections.sort(name);
        for (String str : name) {
            System.out.println(" " + str);
        }
    }
}

class Book {
    String name;
    List<Author> authors;

    public Book(String name, List<Author> authors) {
        this.name = name;
        this.authors = authors;
    }

    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", authors=" + authors + '}';
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}

class Author {
    String name;
    Integer age;

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String toString() {
        return "Author {" + "name = " + name +  ", age = " + age + "}";
    }
}
