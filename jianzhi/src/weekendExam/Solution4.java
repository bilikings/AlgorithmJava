package weekendExam;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package weekendExam
 * @date 2020/9/12 14:48
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String man = scanner.nextLine();
        String  girl = scanner.nextLine();
        String[] mans =man.split(" ");
        String[] girls = girl.split(" ");
        int match = scanner.nextInt();
        for (int i = 0; i < match; i++) {
            String s =scanner.nextLine();
        }
        System.out.println(Math.min(mans.length,girl.length()));
    }
}
