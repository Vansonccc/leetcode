package Directory2800.Sub20;

import java.util.List;

public class Leetcode2828 {
    public boolean isAcronym(List<String> words, String s) {
//        words.stream().map(word->word.charAt(0)).toArray()
        StringBuilder builder = new StringBuilder();
        for (String word: words) {
            builder.append(word.charAt(0));
        }
        return builder.toString().equals(s);
    }
}
