package Directory2100.Sub30;

public class Leetcode2132 {
    public boolean possibleToStamp(int[][] grid, int stampHeight, int stampWidth) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0;j<m;j++){
                if(grid[i][j] == 0){
                    check(grid,i,j,stampHeight,stampWidth);
                }
            }
        }
    }

    private void check(int[][] grid, int i, int j, int stampHeight, int stampWidth) {
        int left=i,right =i;
        int top=j, bot = j;
        while(left>0 && grid[left][j]!=1){
            left--;
        }
        while(right<grid.length && grid[right][j]!=1){
            right++;
        }
        while(top>0 && grid[i][top]!=1){
            top--;
        }
        while(bot<grid[0].length && grid[i][bot]!=1){
            bot++;
        }
        if(right-left>=stampWidth &&  bot-top>=stampHeight){

        }
    }
}
