package RandomCodeChallenges;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int sum[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }

        return sum;
    }
}
