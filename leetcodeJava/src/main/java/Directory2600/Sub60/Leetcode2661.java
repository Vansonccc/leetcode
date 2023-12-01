package Directory2600.Sub60;

import java.util.*;

public class Leetcode2661 {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer,int[]> arrNums = new HashMap<>();
        int length = mat.length;
        int width = mat[0].length;
        for (int i = 0; i< length; i++) {
            for (int j = 0; j < width; j++) {
                arrNums.put(mat[i][j],new int[]{i,j});
            }
        }
        int[] row = new int[length];
        int[] col = new int[width];
        for (int i = 0; i < length * width; i++) {
            int[] index = arrNums.get(arr[i]);
            int index1 = index[0];
            int index2 = index[1];
            if(++row[index1]==width || ++col[index2]==length){
                return i;
            }
        }
        return -1;
    }
}
