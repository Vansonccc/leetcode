package Directory900.SubDirectory900;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Leetcode907 {
    public static void main(String[] args) {

    }

    public int sumSubarrayMins(int[] arr) {
        long res = 0;
        long mod = (long)1e9+7;
        int j,k;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<= arr.length;i++){
            while (!stack.isEmpty()&& arr[stack.peek()]>(i==arr.length?0:arr[i])){
                j = stack.pop();
                k = stack.isEmpty()?-1:stack.peek();
                res = (res + (long)arr[j]*(i-j)*(j-k))%mod;
            }
            stack.push(i);
        }
        return (int)res;
    }
}
