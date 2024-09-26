import java.util.*;

public class FindtheDifference {

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> myMapS = new Hashtable<>();
        Map<Character, Integer> myMapT = new Hashtable<>();
        insert(s, myMapS);
        insert(t, myMapT);

        for (Map.Entry<Character, Integer> entry: myMapT.entrySet()){
            if (!myMapS.containsKey(entry.getKey())){
                return entry.getKey();
            }
            else {
                if(myMapS.get(entry.getKey()) < myMapT.get(entry.getKey())){
                    return entry.getKey();
                }
            }
        }
        return 'n';
    }

    private static void insert (String addition, Map<Character, Integer> integerMap) {
        for (int i = 0; i < addition.length(); i++) {
            char ch = addition.charAt(i);
            if (integerMap.containsKey(ch)){
                integerMap.put(ch, integerMap.get(ch) + 1);
            }
            else {
                integerMap.put(ch, 1);
            }
        }
    }

    public static void main(String[] args) {
        String one = "Oleh";
        String two = "OlehA";
        FindtheDifference solution = new FindtheDifference();
        System.out.println(solution.findTheDifference(one, two));

    }
}
