package solutions;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        String[] strings = {"tea", "ate", "sto", "ost", "eat", "kto"};
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            Arrays.sort(chars);
            System.out.println(chars);
            map.put(Arrays.toString(chars), strings[i]);
        }
        System.out.println(map);
    }
}

