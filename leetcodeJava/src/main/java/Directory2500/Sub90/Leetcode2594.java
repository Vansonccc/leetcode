package Directory2500.Sub90;

import java.util.PriorityQueue;

public class Leetcode2594 {
    public static void main(String[] args) {


    }
    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long r = 1L* ranks[0]*cars*cars;
        while (l<r){
            long m = (l+r)/2;
            if(check(ranks,cars,m)){
                r=m;
            }else {
                l=m+1;
            }
        }
        return l;
    }

    private boolean check(int[] ranks, int cars, long m) {
        long counter =0;
        for (int t:ranks) {
            counter+=(long)Math.sqrt(m/t);
        }
        return counter>=cars;
    }
}
