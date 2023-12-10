package Directory500.Sub90;

import Model.Node;

import java.util.*;

public class Leetcode590 {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        Deque<Object[]> d = new ArrayDeque<>();
        d.addLast(new Object[]{0, root});
        while (!d.isEmpty()) {
            Object[] poll = d.pollLast();
            Integer cnt = (Integer)poll[0]; Node t = (Node)poll[1];
            if (t == null) continue;
            if (cnt == t.children.size()) ans.add(t.val);
            if (cnt < t.children.size()) {
                d.addLast(new Object[]{cnt + 1, t});
                d.addLast(new Object[]{0, t.children.get(cnt)});
            }
        }
        return ans;
    }
}
