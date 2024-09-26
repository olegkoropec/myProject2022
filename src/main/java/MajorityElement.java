import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (myMap.containsKey(nums[i])) {
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            } else {
                myMap.put(nums[i], 1);
            }
        }
        Map.Entry<Integer, Integer> maxEl = null;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (maxEl == null || entry.getValue().compareTo(maxEl.getValue()) > 0)  //  if (maxEl == null || entry.getValue() > maxEl.getValue())    можно и так
                {
                maxEl = entry;
            }
        }
        System.out.println(myMap);


//        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
//            System.out.print(" " + entry);
//            System.out.print(" " + entry.getKey());
//            System.out.print(" " + entry.getValue());
//        }
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//        }

            System.out.printf("key of max element is %s and value is %s %n ", maxEl.getKey(), maxEl.getValue());
        return maxEl.getKey();
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2, 4, 5, 6, 6, 6, 6, 5, 4, 8, 8, 8, 1, 2, 3, 2, 4, 5, 6, 8};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        MajorityElement solution = new MajorityElement();
        solution.majorityElement(arr);
    }
}
