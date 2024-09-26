import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
        Author nechuy_levytskyy = new Author("Іва́н Нечу́й-Леви́цький", 79);
        Author myrnyy = new Author("Пана́с Ми́рний (Пана́с Я́кович Ру́дченко)", 70);
        Author karpenko_karyy = new Author("Іва́н Карпе́нко-Ка́рий (Іван Карпович Тобілевич)", 61);
        List<Author> author = Arrays.asList(nechuy_levytskyy, myrnyy, karpenko_karyy);
        author.stream().forEach(System.out::println);
        System.out.println("--------------------------");

        Book kaydasheva_simya = new Book("Кайдашева сім'я (1879)", Arrays.asList(nechuy_levytskyy));
        Book revut_voly = new Book("Хіба́ реву́ть воли́, як я́сла по́вні? (1875)", Arrays.asList(myrnyy, myrnyy));
        Book sto_tysyach = new Book("Сто тисяч (1889)", Arrays.asList(karpenko_karyy, karpenko_karyy));
        List<Book> books = Arrays.asList(kaydasheva_simya, revut_voly, sto_tysyach);
        books.stream().forEach(System.out::println);
        System.out.println("--------------------------");

        List<String> name = getSortedAuthorNames(books);
        System.out.println(name);
    }

    private static List<String> getSortedAuthorNames(List<Book> books) {
//        List<Author> author;
//        List<String> nameAuthor = new ArrayList<>();
//        for (int i = 0; i < books.size(); i++) {
//            author = books.get(i).getAuthors();
//            for (int j = 0; j < author.size(); j++) {
//                if (!nameAuthor.contains(author.get(j).getName()))
//                    nameAuthor.add(author.get(j).getName());
//            }
//        }
//        Collections.sort(nameAuthor);
//        return nameAuthor;

        List<String> nameAuthor = books.stream().flatMap(book -> book.getAuthors().stream()).map(name -> name.getName()).distinct().collect(Collectors.toList());
        return nameAuthor;
    }
}

class Book {
    String name;
    List<Author> authors;

    Book(String name, List<Author> authors) {
        this.name = name;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return name + ", authors: " + authors;
    }
}

class Author {
    String name;
    Integer age;

    Author(String name, int age) {
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
        return name + "  ";
    }


}
