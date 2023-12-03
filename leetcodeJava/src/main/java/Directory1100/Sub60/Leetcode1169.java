package Directory1100.Sub60;

import java.util.*;

public class Leetcode1169 {
    public static void main(String[] args) {
        String[] transactions = new String[]{"alice,20,800,mtv","alice,50,100,beijing"};
        System.out.println(invalidTransactions(transactions));
    }
    public static List<String> invalidTransactions(String[] transactions) {
        int len = transactions.length;
        String[][] infos = new String[len][4];
        Map<String, List<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            infos[i] = transactions[i].split(",");
            String name = infos[i][0], time = infos[i][1], amount = infos[i][2], city = infos[i][3];
            if (Integer.valueOf(amount) > 1000) {
                set.add(i);
            }
            List<Integer> sameNames = map.getOrDefault(name, new ArrayList<>());
            for (int sameName : sameNames) {
                String[] info = infos[sameName];
                if (!info[3].equals(city) && Math.abs(Integer.valueOf(info[1]) - Integer.valueOf(time)) <= 60) {
                    set.add(sameName);
                    set.add(i);
                }
            }
            sameNames.add(i);
            map.put(name, sameNames);
        }
        List<String> ans = new ArrayList<>();
        for (int index : set) {
            ans.add(transactions[index]);
        }
        return ans;
    }
}
