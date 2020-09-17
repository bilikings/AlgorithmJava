import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 18:37
 */
public class MinNumber {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
        StringBuilder res = new StringBuilder();
        for(String s :strs){
            res.append(s);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        MinNumber minNumber = new MinNumber();

        int[] a = {1,2,3,4,40,5,32,1};
        String s = minNumber.minNumber(a);
        System.out.println(s);
    }
}
