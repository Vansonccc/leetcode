package Directory0.Sub70;

public class Leetcode70 {
    public int climbStairs(int n) {
        int[] array = new int[n+1];
        return recursive(n,array);
    }

    private int recursive(int n, int[] array) {
        if(n<=1){
            return 1;
        }
        if(array[n]!=0){
            return array[n];
        }
        array[n] = recursive(n-1,array)+recursive(n-2,array);
        return array[n];
    }
}
