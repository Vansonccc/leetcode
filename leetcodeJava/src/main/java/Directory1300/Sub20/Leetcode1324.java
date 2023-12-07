package Directory1300.Sub20;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1324 {
    public static void main(String[] args) {
        System.out.println(printVertically("CONTEST IS COMING"));
    }
    public static List<String> printVertically(String s) {
        String[] split = s.split(" ");
        List<String> res = new ArrayList<>();
        int index = 0;
        while (true){
            StringBuilder builder = new StringBuilder();
            String blank ="";
            for (String str:split){
                if(str.length()>index){
                    builder.append(blank).append(str.charAt(index));
                    blank = "";
                }  else {
                    blank += " ";
                }
            }

            if(builder.length()==0){
                break;
            }
            index++;
            res.add(builder.toString());
        }
        return res;
    }
}
