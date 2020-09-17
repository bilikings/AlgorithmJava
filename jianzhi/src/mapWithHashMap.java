import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/8/1 16:00
 */
public class mapWithHashMap {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len=nums1.length;
        int[] res = new int[len];
        int index1 = 0,index2 = 0,resIndex = 0;
        while (index1<nums1.length&&index2< nums2.length){
            if(nums1[index1]<nums2[index2]){
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else {
                res[resIndex] =nums1[index1];
                index1++;
                index2++;
                resIndex++;
            }
        }
        return Arrays.copyOfRange(res,0,resIndex);
    }
}
