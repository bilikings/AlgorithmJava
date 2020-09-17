package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/9 19:09
 */
public class demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,8,1,2,3,7,5,0);

        list.stream().filter((o1)->o1<5).forEach(System.out::println);
    }
}
