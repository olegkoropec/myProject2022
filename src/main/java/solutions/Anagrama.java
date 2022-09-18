package solutions;
import java.util.*;

public class Anagrama {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> myList = Arrays.asList(strs);
        Map<String, List<String>> myMap = new HashMap<>();
        for (String nonSort : myList) {
            String sorted = sorted(nonSort);
            if (myMap.containsKey(sorted)) {
                List<String> list = myMap.get(sorted);
                list.add(nonSort);
            } else {
                List<String> anagrama = new ArrayList<>();
                anagrama.add(nonSort);
                myMap.put(sorted, anagrama);
            }
        }
        List<List<String>> mainList = new ArrayList<>();
        for (Map.Entry<String, List<String>> bigMap : myMap.entrySet()) {
            mainList.add(bigMap.getValue());
        }
        return mainList;
    }

    private static String sorted(String stringer) {
        char[] chars = stringer.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Anagrama solution = new Anagrama();
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Arrays.toString(strings));
        solution.groupAnagrams(strings);
        System.out.println(solution.groupAnagrams(strings));
    }
}