import java.util.ArrayList;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/27 9:46
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }

    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        int i = 0;
        int flag = -1;
        List<StringBuilder> list = new ArrayList<>();
        for (int j = 0; j < numRows; j++) {
            list.add(new StringBuilder());
        }
        for (char c : s.toCharArray()) {
            list.get(i).append(c);
            if(i==0||i==numRows-1) {
                flag= -flag;
            }
            i+=flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder r:list){
            res.append(r);
        }
        return res.toString();
    }
}
