package Directory2000.Sub00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode2008 {
    public static void main(String[] args) {
        int[][] ride = {{2,3,6},{8,9,8},{5,9,7},{8,9,1},{2,9,2},{9,10,6},{7,10,10},{6,7,9},{4,9,7},{2,3,1}};
        System.out.println(maxTaxiEarnings(10,ride));
    }
    public static long maxTaxiEarnings(int n, int[][] rides) {
        List<int[]>[] group = new ArrayList[n + 1];
        for (int[] ride:rides) {
            if(group[ride[1]]==null){
                group[ride[1]] = new ArrayList<>();
            }
            group[ride[1]].add(new int[]{ride[0], ride[1]-ride[0]+ride[2]});
        }
        long[] f = new long[n + 1];
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1];
            if (group[i] != null) {
                for (int[] p : group[i]) {
                    f[i] = Math.max(f[i], f[p[0]] + p[1]);
                }
            }
        }
        return f[n];
    }

}
