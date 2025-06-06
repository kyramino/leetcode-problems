package algorithms.slidingwindow;

/**
 * 3191. Minimum Operations to Make Binary Array Elements Equal to One I
 */
public class MinimumOperationsMakeBinaryArrayElementsEqualToOneI {

    public int minOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) {
                count++;
                nums[i] = 1;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
            }
        }

        if (nums[nums.length - 1] == 0 || nums[nums.length - 2] == 0) {
            return -1;
        }
        return count;
    }

}
