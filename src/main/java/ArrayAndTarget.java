import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

class ArrayAndTarget {
    public int[] twoSum(int[] nums, int target) {
        int i;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i!=map.get(target - nums[i]))  {
                return new int[] {i, map.get(target - nums[i])};
            }
        }
        return null;
    }
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 7, 4, 5, 8};
        int [] arr = {3,3,3,3};
//        int [] arr = {-2,-4,-6,-7};
        int target = 6;
        ArrayAndTarget arrayAndTarget = new ArrayAndTarget();
        arrayAndTarget.twoSum(arr, target);
        System.out.println(Arrays.toString(arrayAndTarget.twoSum(arr, target)));
    }
}