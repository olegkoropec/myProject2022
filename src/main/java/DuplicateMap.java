import java.util.HashMap;
import java.util.Map;

class DuplicateMap {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        System.out.println();
        System.out.print(map);
        System.out.println();
        int j = 0;

        for (Map.Entry<Integer, Integer> num : map.entrySet())
            if (num.getValue() > 1)
                j++;
        if (j > 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 4, 4};
        for (int i : arr)
            System.out.print(" " + i);
        DuplicateMap solution = new DuplicateMap();
        solution.containsDuplicate(arr);
    }
}