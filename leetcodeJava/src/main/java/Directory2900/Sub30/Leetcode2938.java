package Directory2900.Sub30;

public class Leetcode2938 {
    public static void main(String[] args) {

    }

    public long minimumSteps(String s) {
        long res=0;
        int count_black = 0;
        for(char c: s.toCharArray()){
            if(c == '1'){
                count_black++;
            }else{
                res += count_black;
            }
        }
        return res;

    }
}
