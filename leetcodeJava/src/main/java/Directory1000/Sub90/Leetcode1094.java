package Directory1000.Sub90;

public class Leetcode1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] counter = new int[1001];
        for (int[] trip : trips) {
            int pass = trip[0], from = trip[1], to = trip[2];
            counter[from] += pass;
            counter[to] -= pass;
        }

        for (int count : counter) {
            capacity -=count;
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }
}
