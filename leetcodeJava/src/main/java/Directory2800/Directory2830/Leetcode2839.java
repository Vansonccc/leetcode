package Directory2800.Directory2830;

public class Leetcode2839 {
    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd","cdab"));
    }

    public static boolean canBeEqual(String s1, String s2) {
        boolean flag1, flag2;
        if ((s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) || (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0))) {
            flag1 = true;
        } else {
            flag1 = false;
        }
        if ((s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) || (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1))) {
            flag2 = true;
        } else {
            flag2 = false;
        }
        return flag1 && flag2;
    }
}
