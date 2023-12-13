package Directory2700.Sub40;

public class Leetcode2745 {
    public int longestString(int x, int y, int z) {
        return 2*(Math.min(x,y)*2+z + (x==y?0:1));
    }
}
