package Directory1600.Sub30;

public class Leetcode1631 {
    public static void main(String[] args) {
        int[][] temp = {{1,2,2},{3,8,2},{5,3,5}};
    }
    public static int minimumEffortPath(int[][] heights) {
        int[][] gap = new int[heights.length][heights[0].length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <heights.length ; i++) {
            for(int j = 0;j<heights[0].length;j++){
                int top = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if(i-1>=0){
                    top = Math.abs(heights[i-1][j] -heights[i][j]);
                }
                if(j-1>=0){
                    left = Math.abs(heights[i][j-1] -heights[i][j]);
                }
                if(j+1<heights[0].length){
                    right = Math.abs(heights[i][j+1] -heights[i][j]);
                }
                min = Math.min(min,Math.min(top,Math.min(left,right)));
            }
        }
        return min;
    }
}
