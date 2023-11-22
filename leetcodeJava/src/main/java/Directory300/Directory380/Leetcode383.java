package Directory300.Directory380;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Leetcode383 {
    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String,Integer> map = new HashMap<>();
        for (int  i=0; i<magazine.length();i++){
            map.merge(String.valueOf(magazine.charAt(i)),1,Integer::sum);
        }
        for (char c :ransomNote.toCharArray()) {
            map.merge(String.valueOf(c),-1,Integer::sum);
            if (!map.containsKey(String.valueOf(c)) || map.get(String.valueOf(c))<0){
                return false;
            }
        }
        return true;
    }
}
