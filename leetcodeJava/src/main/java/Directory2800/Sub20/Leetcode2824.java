package Directory2800.Sub20;

import java.util.List;

public class Leetcode2824 {
    public static void main(String[] args) {

    }

    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for(int i = 0; i<nums.size()-1;i++){
            for(int j =i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    res++;
                }
            }
        }
        return res;
    }
}
