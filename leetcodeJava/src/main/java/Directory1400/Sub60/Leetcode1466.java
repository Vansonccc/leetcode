package Directory1400.Sub60;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1466 {
    private List<int[]>[] path;
    public int minReorder(int n, int[][] connections) {
        path = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            path[i] = new ArrayList<>();
        }
        for (int[] conn: connections) {
            path[conn[0]].add(new int[]{conn[1],1});
            path[conn[1]].add(new int[]{conn[0],0});
        }
        return dfs(0,-1);
    }

    private int dfs(int x, int father) {
        int res =0;
        for (int[] next:path[x]) {
            if(father!=next[0]){
                res +=next[1]+dfs(next[0],x);
            }
        }
        return res;
    }
}
