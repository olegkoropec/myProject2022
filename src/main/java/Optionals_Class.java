import java.util.Optional;

public class Optionals_Class {
    public static void main(String[] args) {
        Person oleh = new Person("Oleh", "OLEH@gmail.com");
//        System.out.println("email of Oleh: " + oleh.getEmail().toLowerCase());
        System.out.println("email of Oleh: " + oleh.getEmail().map(String::toLowerCase).orElse("Oleh has not email"));
        Person artem = new Person("Artem", null);
        System.out.println("email of Artem: " + artem.getEmail().map(String::toLowerCase).orElse("Artem has not email"));

        System.out.println("Можна і так--------------------------------");

        if (oleh.getEmail().isPresent()) {
            String olehOptional = oleh.getEmail().get();          // для діставання чогось (в нас це String) із Optional треба використовувати метод get()
            System.out.println(olehOptional.toLowerCase());
        } else {
            System.out.println("Oleh has not email");
        }
    }
}

class Person {
    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

//    public String getEmail() {
//        return email;
//    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }


}
