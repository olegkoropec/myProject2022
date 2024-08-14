package CollectionsTemplate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyExampleMap {
    public static void main(String[] args) {
        Map<Integer, Character> mymapHash = new HashMap<>();
        Map<Integer, Character> mymapLinked = new LinkedHashMap<>();
        Map<String, Character> mymapTree = new TreeMap<>();
//        Map<Integer, Character> mymapTable = new Hashtable<>();       синхронізована версія HashMap(), викорисровується для багатопоточного програмування

        mymapHash.put(5, 'q');              // HashMap - невпорядкований список, має найбільш високу продуктивність
        mymapHash.put(2, 'w');
        mymapHash.put(3, 'e');
        mymapHash.put(4, 'r');
        mymapHash.put(1, 't');

        mymapLinked.put(2, 'a');            // LinkedHashMap - впорядкований список (в якому порядку введене, в такому і виведеться)
        mymapLinked.put(4, 's');
        mymapLinked.put(3, 'd');
        mymapLinked.put(5, 'f');
        mymapLinked.put(1, 'g');

        mymapTree.put("1", 'z');              // TreeMap - відсортований список (виведеться від найбільшого до найменшого)
        mymapTree.put("4", 'x');
        mymapTree.put("3", 'c');
        mymapTree.put("2", 'v');
        mymapTree.put("5", 'b');

        System.out.println("mymapHash: " + mymapHash);
        System.out.println("mymapLinked: " + mymapLinked);
        System.out.println("mymapTree: " + mymapTree);
        System.out.println("----------------------------------");
        System.out.println("keySet mymapHash: "+ mymapHash.keySet());
        System.out.println("values mymapHash:"+ mymapHash.values());
        System.out.println("----------------------------------");

        for (Map.Entry<Integer, Character> entryHash : mymapHash.entrySet()) {
            System.out.print(entryHash.getKey() + " " + entryHash.getValue() + ";  ");
        }
        System.out.println();

        for (Map.Entry<Integer, Character> entryLinked : mymapLinked.entrySet()) {
            if (entryLinked.getKey() == 1)                                          // порівняння ключів якщо ключ НЕ String
                entryLinked.setValue('O');
        }
        System.out.println("New mymapLinked: " + mymapLinked);

        for (Map.Entry<String, Character> entryTree : mymapTree.entrySet()) {
            if ("2".equals(entryTree.getKey()))                                     // порівняння ключів якщо ключ String
                entryTree.setValue('9');
        }
        System.out.println("New mymapTree: "+ mymapTree);
    }
}
