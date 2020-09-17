package exam;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/8/8 14:06
 */
public class sulotion {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n= sc.nextInt();
       long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextLong();
        }
        long count =0;
        for (long a: arr) {
            count+= a/2;
        }
        System.out.println(count);

//        for (int a: arr) {
//            System.out.println(a);
//        }
    }
}
