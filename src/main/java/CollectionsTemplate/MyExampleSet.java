package CollectionsTemplate;

import java.util.*;

public class MyExampleSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        SortedSet<String> sortedSet = new TreeSet<>();

        hashSet.add(8);             // HashSet - невпорядкований список, має найбільш високу продуктивність
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(0);

        linkedHashSet.add('w');         // LinkedHashSet - впорядкований список (в якому порядку введене, в такому і виведеться)
        linkedHashSet.add('q');
        linkedHashSet.add('t');
        linkedHashSet.add('i');
        linkedHashSet.add('o');

        treeSet.add("Artem");        // TreeSet - відсортований список (виведеться від найбільшого до найменшого)
        treeSet.add("Olesya");
        treeSet.add("Maxim");
        treeSet.add("Tima");
        treeSet.add("Tasya");

        sortedSet.add("Artem");
        sortedSet.add("Olesya");
        sortedSet.add("Maxim");
        sortedSet.add("Tima");
        sortedSet.add("Tasya");

        System.out.println(hashSet + "hashSet ");
        System.out.println(linkedHashSet + "linkedHashSet ");
        System.out.println(treeSet + "treeSet ");
        System.out.println(sortedSet + "sortedSet ");
    }
}
