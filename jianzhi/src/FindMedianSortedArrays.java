import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/12 11:42
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1L = 0, num1R = nums1.length - 1;
        int num2L = 0, num2R = nums2.length - 1;
        return 0;
    }

    public static int bSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int res = 0;//返回index
        int l = 0, r = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target) {
                r = mid;
            } else if (arr[mid] < target) {
                l = mid;
            } else {
                res = mid;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr  ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(bSearch(arr, 1));
    }
}
