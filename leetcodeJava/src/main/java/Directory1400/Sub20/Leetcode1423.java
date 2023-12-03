package Directory1400.Sub20;

public class Leetcode1423 {
    public static void main(String[] args) {
        maxScore(new int[]{1,2,3,4,5,6,1},3);
    }
    public static int maxScore(int[] cardPoints, int k) {
        int length = cardPoints.length;
        int n = length-k;
        int sum = 0;
        int cur =0;
        for (int i = 0; i <length ; i++) {
            if(i<n){
                cur+=cardPoints[i];
            }
            sum+=cardPoints[i];
        }
        int min = cur;
        for (int i = n; i <length ; i++) {
            cur = cur+cardPoints[i]-cardPoints[i-n];
            min = Math.min(min,cur);
        }

        return sum-min;
    }
}
