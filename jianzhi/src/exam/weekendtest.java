package exam;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/6 9:57
 */
public class weekendtest {
    public static String modifyString(String s) {
        char[] chars = s.toCharArray();
        int f = 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                if ((f & 1) == 0) {
                    chars[i] = 'a';
                }else {
                    chars[i] = 'b';
                }
                f++;
                if(i!=0&&(chars[i-1]=='a'||chars[i-1]=='b')){
                    chars[i] ='c';
                }
                if(i<chars.length-1&&(chars[i+1]=='a'||chars[i+1]=='b'||chars[i+1]=='c')){
                    chars[i]  = 'd';
                }
            }

        }

        return new String(chars);
    }

    public int numTriplets(int[] nums1, int[] nums2) {
        int count = 0;
        for (int value : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = j + 1; k < nums2.length; k++) {
                    if (value * value == nums2[j] * nums2[k]) {
                        count++;
                    }
                }
            }
        }
        for (int value : nums2) {
            for (int j = 0; j < nums1.length; j++) {
                for (int k = j + 1; k < nums1.length; k++) {
                    if (value * value == nums1[j] * nums1[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "??cw";
        System.out.println(modifyString(s));
    }
}
