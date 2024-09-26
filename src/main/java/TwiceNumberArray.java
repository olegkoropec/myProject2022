public class TwiceNumberArray {
    public boolean contains_Duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        TwiceNumberArray solution = new TwiceNumberArray();
        solution.contains_Duplicate(arr);
        System.out.println(solution.contains_Duplicate(arr));
    }
}
