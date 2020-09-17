import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/23 11:42
 */
public class Permutation {
    List<String> list = new LinkedList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }

    public void dfs(int x) {//第x位交换
        if (x == c.length - 1) {
            list.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) {
                continue;//重复，剪枝
            }
            set.add(c[i]);
            swap(i,x); // 交换，将 c[i] 固定在第 x 位
            dfs(x+1);// 开启固定第 x + 1 位字符
            swap(i,x);// 恢复交换
        }
    }

    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
}
