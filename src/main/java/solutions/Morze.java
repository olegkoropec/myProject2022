package solutions;

import java.util.HashMap;
import java.util.Map;

public class Morze {
    public static void main(String[] args) {
        Map <Character, String> map = new HashMap<Character, String>();
        String morze = "england";
        map.put('a', ".-");
        map.put('e', ".");
        map.put('g', "--.");
        map.put('d', "-..");
        map.put('l', ".---");
        map.put('n', "-");


        for (int i = 0; i < morze.length(); i ++){
            morze.charAt(i);

            String str = map.get(morze.charAt(i));
            System.out.print(" " + str);
        }
    }
}
