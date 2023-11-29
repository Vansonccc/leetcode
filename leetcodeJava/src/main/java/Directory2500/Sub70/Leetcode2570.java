package Directory2500.Sub70;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left =0;
        int right = 0;
        List<int[]> res = new ArrayList<>();
        while (left<nums1.length& right<nums2.length) {
            if(nums1[left][0]<nums2[right][0]){
                res.add(nums1[left]);
                left++;
            } else if(nums1[left][0]>nums2[right][0]){
                res.add(nums2[right]);
                right++;
            } else {
                res.add(new int[]{nums1[left][0],nums1[left][1]+nums2[right][1]});
                left++;
                right++;
            }
        }
        while (left<nums1.length){
            res.add(nums1[left]);
            left++;
        }
        while (right<nums2.length){
            res.add(nums2[right]);
            right++;
        }

        int[][] finalRes = new int[res.size()][2];
        for (int i = 0; i <res.size() ; i++) {
            finalRes[i] = res.get(i);
        }
        return finalRes;
    }
}
