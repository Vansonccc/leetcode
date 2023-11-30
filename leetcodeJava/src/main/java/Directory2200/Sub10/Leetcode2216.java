package Directory2200.Sub10;

public class Leetcode2216 {
    public static void main(String[] args) {
        System.out.println(minDeletion(new int[]{1,1,2,3,5}));
    }

    public static int minDeletion(int[] nums) {
        int res =0;
        if (nums.length == 0) {
            return res;
        }
        int n = nums.length;
        for (int i = 0; i <n-1 ; ++i) {
            if(nums[i]==nums[i+1]){
                res +=1;
            } else{
                i++;
            }
        }
        res += (n-res)%2;
        return res;
    }
}
