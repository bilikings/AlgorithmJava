package exam;

import javax.xml.transform.sax.SAXSource;
import java.util.*;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/6 20:18
 */
public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            int i = o2.getValue().compareTo(o1.getValue());
            if(i==0){
                i = o1.getKey().compareTo(o2.getKey());
            }
            return i;
        });

        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
        }
//        for (int i = k-1; i >=0; i--) {
//            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
//        }
    }
}
