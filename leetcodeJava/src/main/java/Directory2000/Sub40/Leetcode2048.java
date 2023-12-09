package Directory2000.Sub40;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2048 {
    public static void main(String[] args) {
        System.out.print(nextBeautifulNumber(1));
    }
    public static int nextBeautifulNumber(int n) {
        int res =n;
        for (int i = n+1; i <1000000 ; i++) {
            Map<Integer,Integer> map = new HashMap<>();
            int num = i;
            while (num>0){
                map.merge(num%10,1,Integer::sum);
                num = num/10;
            }
            boolean flag =true;
            for (Map.Entry entry: map.entrySet()) {
                if(entry.getKey()!=entry.getValue()){
                    flag =false;
                }
            }
            if(flag){
                return i;
            }
        }
        return res;
    }
}
