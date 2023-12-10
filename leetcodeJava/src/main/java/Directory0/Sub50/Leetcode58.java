package Directory0.Sub50;

public class Leetcode58 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for (int i = 1; i <n ; i++) {
            nums[i] += Math.max(nums[i-1],0);
            max = Math.max(nums[i],max);
        }
        return max;

    }
}
