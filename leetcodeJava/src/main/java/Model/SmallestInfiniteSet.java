package Model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SmallestInfiniteSet {
    private int curr = 0;
    private TreeSet<Integer> set = new TreeSet<>();
    public SmallestInfiniteSet() {

    }

    public int popSmallest() {
        if(set.isEmpty()){
            return ++curr;
        }
        return set.pollFirst();
    }

    public void addBack(int num) {
        if (num <= curr) set.add(num);
    }
}
