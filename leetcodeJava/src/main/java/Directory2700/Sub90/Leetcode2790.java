package Directory2700.Sub90;

import java.util.*;
import java.util.stream.Collectors;

public class Leetcode2790 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        maxIncreasingGroups(list);
    }
    public static int maxIncreasingGroups(List<Integer> usageLimits) {
        Collections.sort(usageLimits);
        long cache = 0;
        int res =0;
        for (int num:usageLimits) {
            cache +=num;
            if(cache>res){
                cache-=(res+1);
                res++;
            }
        }
        return res;
    }
}
