package Directory2400.Sub50;

import java.lang.reflect.Array;
import java.util.*;

public class Leetcode2454 {
    public static void main(String[] args) {
        secondGreaterElement(new int[]{2,4,0,9,6});
    }
    public static int[] secondGreaterElement(int[] nums) {
        int[] res =new int[nums.length];
        Arrays.fill(res,-1);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            int val = nums[i];
            while (!list1.isEmpty()&& nums[list1.get(list1.size()-1)]<val){
                res[list1.get(list1.size()-1)] = val;
                list1.remove(list1.size()-1);
            }
            int j = list2.size();
            while (j > 0 && nums[list2.get(j - 1)] < val) {
                j--; // s 栈顶的下一个更大元素是 x
            }
            List<Integer> popped = list2.subList(j, list2.size());
            list1.addAll(popped); // 把从 s 弹出的这一整段元素加到 t
            popped.clear(); // 弹出一整段元素
            list2.add(i); // 当前元素（的下标）加到 s 栈顶
        }
        return res;
    }
}
