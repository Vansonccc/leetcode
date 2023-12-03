package Directory1200.Sub20;

public class Leetcode1221 {
    public int balancedStringSplit(String s) {
        int res=0;
        int counter =0;
        for (char c: s.toCharArray()){
            if(c=='L'){
                counter++;
            }else {
                counter--;
            }
            if(counter==0){
                res++;
            }
        }
        return res;
    }
}
