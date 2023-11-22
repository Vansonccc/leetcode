package Directory100.Directory120;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {
    public static void main(String[] args) {

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n:nums) {
            set.add(n);
        }
        int res = 0;
        for (int num: set) {
            if(!set.contains(num+1)){
                int left = num-1;
                int temp = 1;
                while (set.contains(left--)){
                    temp++;
                }
                res = Math.max(res,temp);
            }
        }
        return res;
    }
}
