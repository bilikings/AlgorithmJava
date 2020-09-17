import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 18:20
 */
public class SumNums {
    /**
     * 利用语法短路的特性
     * A&&B，如果A为false，则B不会执行
     * A||B，如果A为true，B不会执行
     * 所以，n>1&&sumNums(n-1):
     * 如果n>1成立，则执行sumNums(n-1)，达成了if的功能
     */
    int res = 0;

    public int sumNums(int n) {
        boolean f = n > 1 && sumNums(n - 1) > 0;
        res += n;

        return res;
    }
}
