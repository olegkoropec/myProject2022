package CollectionsTemplate;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
//        negativeNumber();
//        noNullShow();
//        andMethod();
        orMethod();
    }

    static void negativeNumber() {
        Predicate<Integer> negative = number -> number < 0;
        System.out.println(negative.test(-6));
        System.out.println(negative.test(0));
        System.out.println(negative.test(8));
    }

    static void noNullShow(){
        //Створити лямбда вираз, котрий повертає значення true, якщо рядок не null,
        // використовуючи функціональний інтерфейс Predicate

        // Це рішення за допомогою анононімного класу
//        Predicate<String> stringPredicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s != null;
//            }
//        };

//        Це рішення за допомогою функціонального інтерфейсу Predicate
        Predicate<String> stringPredicate = s -> s != null;
        System.out.println(stringPredicate.test(""));
        System.out.println(stringPredicate.test(null));
        System.out.println(stringPredicate.test("hello"));
    }

    static void andMethod(){
//        Зясувати чи зустрічаються у слові літери A та B latin
        Predicate<String> andPredicat1 = s -> s.contains("A");
        Predicate<String> andPredicat2 = s -> s.contains("B");

        System.out.println(andPredicat1.and(andPredicat2).test("SBCD"));
        System.out.println(andPredicat1.and(andPredicat2).test("ABCD"));
    }

    static void orMethod(){
        //Перевірити чи рядок починається з літер J або N та закінчується з O

        Predicate<String> predicate1 = s -> s.startsWith("J");
        Predicate<String> predicate2 = s -> s.startsWith("N");
        Predicate<String> predicate3 = s -> s.endsWith("O");

        Predicate<String> result = predicate1.or(predicate2).and(predicate3);

        System.out.println(result.test("JON"));
        System.out.println(result.test("NEO"));
        System.out.println(predicate1.or(predicate2).and(predicate3).test("NILL"));
        System.out.println(result);
    }

}
