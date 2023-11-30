package Directory1600.Sub50;

import java.util.Arrays;

public class Leetcode1657 {
    public static void main(String[] args) {

    }

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] counter1 = new int[26];
        int[] counter2 = new int[26];
        for (char c:word1.toCharArray()) {
            counter1[c-'a']++;
        }
        for (char c:word2.toCharArray()) {
            counter2[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((counter1[i] == 0) != (counter2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(counter1);
        Arrays.sort(counter2);
        return Arrays.equals(counter1,counter2);
    }
}
