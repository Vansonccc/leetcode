package Directory2800.Sub10;

import java.util.List;
import java.util.Stack;

public class Leetcode2811 {
    public boolean canSplitArray(List<Integer> nums, int m) {
        int n = nums.size();
        if (n <= 2) return true;
        for (int i = 1; i < n; i++)
            if (nums.get(i - 1) + nums.get(i) >= m)
                return true;
        return false;
    }
}
