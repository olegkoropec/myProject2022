import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacter {
    public int firstUniqChar(String s) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            characterList.add(ch);
        }

        System.out.println(characterList);
        System.out.println(characterList.get(1));

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character listValue : characterList) {
            if (map.containsKey(listValue)) {
                map.put(listValue, map.get(listValue) + 1);
            } else {
                map.put(listValue, 1);
            }
        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return characterList.indexOf(entry.getKey());
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        UniqueCharacter solution = new UniqueCharacter();
        String example = "aabb";
        System.out.println(solution.firstUniqChar(example));

    }
}
