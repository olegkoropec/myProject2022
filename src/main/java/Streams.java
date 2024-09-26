import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

//        System.out.println("Старий підхід");

//        List<String> herbivore = new ArrayList<>();
//        for (Animal animal : animals) {
//            if (animal.getClassification().equals(Classification.HERBIVORE))
//                herbivore.add(animal.getName());
//        }
//        System.out.println(herbivore);


//        System.out.println("Новий підхід");

//        System.out.println("filter-------------------------------");
//        List<Animal> predator = animals.stream()
//                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
//                .collect(Collectors.toList());
//        System.out.println(predator);
//        predator.forEach(System.out::println);
//
//        System.out.println("sorted----------------------------------------");
//        List<Animal> sort = animals.stream()
//                .sorted(Comparator.comparing(Animal::getAge).thenComparing(Animal::getName).reversed())
//                .collect(Collectors.toList());
//        sort.forEach(System.out::println);

//        System.out.println("allMatch---чи всі age більше 10?. Ні. Тому false---");
//        boolean allMatch = animals.stream().allMatch(animal -> animal.getAge() > 10);
//        System.out.println(allMatch);

//        System.out.println("anyMatch-----чи є хоч один age більше 200?. Так. Тому true---");
//        boolean anyMatch = animals.stream().anyMatch(animal -> animal.getAge() > 200);
//        System.out.println(anyMatch);

//        System.out.println("noneMatch----чи є хтось з іменем Dog. Ні. Тому true-------------");
//        boolean noneMatch = animals.stream().noneMatch(animal -> animal.getName().equals("Dog"));
//        System.out.println(noneMatch);

//        System.out.println("max-----------------------------------------------");
//        animals.stream().max(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);

        System.out.println("Group-----------------------------------------------");
//        animals.stream()
//                .collect(Collectors.groupingBy(Animal::getClassification));    // - пишемо так, в Map перетворюється після натискання на "introduce local variable"

        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));

        classificationListMap.forEach((classification, animals1) -> {       // вивести на екран що зберігається у Map
            System.out.println(classification);

//            System.out.println(animals1);

            animals1.forEach(System.out::println);
        });

//        System.out.println("Виведе найстаршого звіра. Лише імя----------------------------------");
//        animals.stream()        // це називється chaining, тобто виклик одного метода за іншим
//                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
//                .max(Comparator.comparing(Animal::getAge))
//                .map(Animal::getName)
//                .map(String::toUpperCase)
//                .ifPresent(System.out::println);

//        animals.stream().findFirst().ifPresent(System.out::println);

//        animals.parallelStream().findAny().ifPresent(System.out::println);


    }

    public static List<Animal> getAnimals() {
        return List.of(
                new Animal("Elefant", 35, Classification.HERBIVORE),
                new Animal("Monkey", 20, Classification.OMNIVOROUS),
                new Animal("Tiger", 20, Classification.PREDATOR),
                new Animal("Elefant1", 55, Classification.HERBIVORE),
                new Animal("Monkey1", 4, Classification.OMNIVOROUS),
                new Animal("Tiger1", 10, Classification.PREDATOR),
                new Animal("Dinosaurus", 201, Classification.HERBIVORE)
        );
    }

}

enum Classification {
    HERBIVORE, PREDATOR, OMNIVOROUS;
}

class Animal {
    String name;
    int age;
    Classification classification;

    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return name + ", age = " + age + ", classification: " + classification;
    }
}
