package Directory2400.Sub70;

import java.util.*;

public class Leetcode2477 {
    private Map<Integer, List<Integer>> map = new HashMap<>();
    private long res =0;
    public long minimumFuelCost(int[][] roads, int seats) {
        for (int[] road: roads) {
            map.computeIfAbsent(road[0],v->new ArrayList<>()).add(road[1]);
            map.computeIfAbsent(road[1],v->new ArrayList<>()).add(road[0]);
        }
        dfs(0, -1, seats);
        return res;
    }

    private  long dfs(int node, int parent,int seats) {
        if(!map.containsKey(node)){
            return 0;
        }
        int representatives = 1; // 包括自己在内的代表数量
        for (int child : map.get(node)) {
            if (child != parent) { // 避免向父节点递归
                representatives += dfs(child, node,seats);
            }
        }

        // 如果不是首都节点，则需要计算燃油成本
        if (node != 0) {
            res += Math.ceil((double) representatives / seats);
        }

        return representatives;
    }

}
