import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 11:08
 */
public class FindRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> bucketHigh =new HashSet<>();
        int rep =-1;
        for (int val : nums) {
            if(!bucketHigh.add(val)){
                rep=val;
                break;
            }
        }
        return rep;
    }

    public static void main(String[] args) {
        int[] a ={2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(a));
    }
}
