package CollectionsTemplate;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);      // Optional.empty

        System.out.println("1--------------------------------");

        Optional<String> noEmpty = Optional.ofNullable("I am here");
        System.out.println(noEmpty.isEmpty());          // у noEmpty є щось тому - false
        System.out.println(noEmpty.isPresent());        // у noEmpty є щось тому - true
        System.out.println(noEmpty);                    // Optional[I am here]

        System.out.println("2--------------------------------");

        noEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("ifPresentOrElse_noEmpty"));      // не пусто тому виводиться що у noEmpty
        empty.ifPresentOrElse(System.out::println, () -> System.out.println("ifPresentOrElse_empty"));          // пусто тому виводиться що у sout()
        noEmpty.ifPresent(v -> System.out.println("noEmpty ifPresent + " + v));     // у noEmpty щось є тому виводиться
        empty.ifPresent(v -> System.out.println("empty ifPresent" + v));            // у еmpty нічого немає тому нічого НЕ виводиться

        System.out.println("3--------------------------------");

        Optional<String> IAm = Optional.of("i am");                  // метод of не призначений для пустих коробочок, повинно щось лежати, null - HI
        System.out.println(IAm);

        String orElse = noEmpty.orElse("I am orElse");     // метод orElse -  в Optional noEmpty лежить щось, тому я отримую "I am here"
        System.out.println(orElse);

        String orElseNo = empty.orElse("I am orElseNo");        // метод orElse - в Optional empty HEлежить щось, тому я отримую "I am orElseNo"
        System.out.println(orElseNo);

        String iam = empty
                .map(String::toUpperCase)
                .orElseGet(() -> {                       // якщо Optional пустий (в нас empty - пустий), то виконається логіка та що у orElseGet,
                    // якщо ні то виконається те що написано в Optional
                    // todo some logic
                    return "orElseGe()";
                });
        System.out.println(iam);

    }
}
