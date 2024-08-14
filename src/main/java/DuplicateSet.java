import java.util.HashSet;
import java.util.Set;

class DuplicateSet {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 4, 1, 3};
        for (int i : arr) {
            System.out.printf("%d ", i);
        }

        System.out.println();
        DuplicateSet solution = new DuplicateSet();
        solution.containsDuplicate(arr);
        System.out.println(solution.containsDuplicate(arr));
    }
}
