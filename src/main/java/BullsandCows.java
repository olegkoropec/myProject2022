import java.util.*;

class BullsandCows {

    public String getHint(String secret, String guess) {
        int numberBulls = 0;
        int numberCows = 0;
        List<Character> listStringSecret = new LinkedList<>();
        List<Character> listStringGuess = new LinkedList<>();
        insertList(secret, listStringSecret);
        insertList(guess, listStringGuess);
        System.out.println(listStringSecret);
        System.out.println(listStringGuess);

        for (int i = 0; i < listStringGuess.size(); i++) {
            if (listStringSecret.get(i) == listStringGuess.get(i)) {
                listStringSecret.remove(i);
                listStringGuess.remove(i);
                numberBulls++;
                i--;
            }
        }

        Map<Character, Integer> mapSecret = new HashMap<>();
        Map<Character, Integer> mapGuess = new HashMap<>();

        insertMap(listStringSecret, mapSecret);
        insertMap(listStringGuess, mapGuess);

        System.out.println("mapSecret " + mapSecret);
        System.out.println("mapGuess " + mapGuess);
        for (Map.Entry<Character, Integer> finalMap: mapGuess.entrySet()) {
            if (mapSecret.containsKey(finalMap.getKey())) {
                if (mapSecret.get(finalMap.getKey()) >= mapGuess.get(finalMap.getKey())) {
                    numberCows = numberCows + mapGuess.get(finalMap.getKey());
                } else {
                    numberCows = numberCows + mapSecret.get(finalMap.getKey());
                }
            }
        }
        System.out.println("numberBulls: " + numberBulls);
        System.out.println("numberCows: " + numberCows);

        return numberBulls + "A" + numberCows + "B";

    }

    private static void insertList(String str, List<Character> list) {
        for (int i = 0; i < str.length(); i++) {
            char insertChar = str.charAt(i);
            list.add(insertChar);
        }
    }

    private static void insertMap(List<Character> list, Map<Character, Integer> map) {
        for (Character character : list) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
    }

    public static void main(String[] args) {
        String stringSecret = "0111";
        String stringGuess = "1123";
        BullsandCows solution = new BullsandCows();
        System.out.println(solution.getHint(stringSecret, stringGuess));
    }
}