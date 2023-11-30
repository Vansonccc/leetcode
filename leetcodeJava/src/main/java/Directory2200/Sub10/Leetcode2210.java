package Directory2200.Sub10;

public class Leetcode2210 {
    public static void main(String[] args) {

    }
    public int countHillValley(int[] nums) {
        int res =0;
        int pre =nums[0];

        for (int i =0; i<nums.length-1;i++){
            if(pre<nums[i] && nums[i]>nums[i+1]){
                res++;
                pre = nums[i];
            }else if(pre>nums[i] && nums[i]<nums[i+1]){
                res++;
                pre = nums[i];
            }
        }
        return res;
    }
}
