package solutions;

import java.util.*;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteStat = new LinkedHashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            if (ransomNoteStat.containsKey(currentChar)) {
                ransomNoteStat.put(currentChar, ransomNoteStat.get(currentChar) + 1);
            } else {
                ransomNoteStat.put(currentChar, 1);
            }
        }

        Map<Character, Integer> magazineStat = new LinkedHashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char currentChar = magazine.charAt(i);
            if (magazineStat.containsKey(currentChar)) {
                magazineStat.put(currentChar, magazineStat.get(currentChar) + 1);
            } else {
                magazineStat.put(currentChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> myMap : ransomNoteStat.entrySet()) {
            if (magazineStat.containsKey(myMap.getKey())) {
                if (ransomNoteStat.get(myMap.getKey()) > magazineStat.get(myMap.getKey())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        String string1 = "qqaz";
        String string2 = "qeeaz";
        solution.canConstruct(string1, string2);
        System.out.println(solution.canConstruct(string1, string2));
    }
}
