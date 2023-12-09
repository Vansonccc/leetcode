package Directory1700.Sub40;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1742 {
    public static void main(String[] args) {
        System.out.print(countBalls(1,10));
    }
    public static int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = lowLimit; i <highLimit+1 ; i++) {
            int num = i;
            int sum=0;
            while (num>0){
                sum+=num%10;
                num = num/10;
            }
            map.merge(sum,1,Integer::sum);
        }
        int max=0;
        for (int val:
             map.values()) {
            max = Math.max(max,val);
        }
        return max;
    }
}
