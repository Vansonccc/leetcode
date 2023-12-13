package Directory2600.Sub90;

public class Leetcode2697 {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right =s.length()-1;
        char [] res = s.toCharArray();
        while(left<right){
            char a = s.charAt(left);
            char b = s.charAt(right);
            if(a==b){
                res[left] = a;
                res[right] = b;
            } else {
                res[left] = res[right] = (char) Math.min(a,b);
            }
            left++;
            right--;
        }
        return new String(res);
    }
}
