package Directory2900.Sub30;

public class Leetcode2932 {
    public int maximumStrongPairXor(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    res = Math.max(res, nums[i] ^ nums[j]);
                }
            }
        }
        return res;
    }
}
