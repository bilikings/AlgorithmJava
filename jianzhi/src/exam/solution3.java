package exam;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/6 20:26
 */
public class solution3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums =new int[m];
        int[] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            int i1 = sc.nextInt();
            nums[i] = i1;
            nums2[i] =i1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < m; i++) {
            int mid = m>>1;
            if( nums2[i] <nums[mid]){
                System.out.println(nums[mid]);
            }else {
                System.out.println(nums[mid-1]);
            }
        }
    }
}
