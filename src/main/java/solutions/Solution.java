package solutions;
import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map <Character, String> map = new HashMap<>();
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".---");
        map.put('m', "--");
        map.put('n', "-");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder build = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                build.append(map.get(ch));
            }
            String string = build.toString();
            set.add(string);
            System.out.println(string);
        }
        System.out.println(set.size());
            return set.size();
    }
        public static void main(String[] args) {
        Solution solution = new Solution();
            String [] words = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
            solution.uniqueMorseRepresentations(words);
}
}