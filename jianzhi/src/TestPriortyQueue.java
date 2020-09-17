import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/8/1 20:24
 */
public class TestPriortyQueue {
    //优先级队列
    public int findK(int[] nums ,int k ){
        PriorityQueue<Integer> queue =new PriorityQueue<>();
        for(int num:nums){
            queue.add(num);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        String str = " -3344 ";
        String p = "\\s*([+-]?\\d+)";
        Pattern r = Pattern.compile(p);

        Matcher matcher = r.matcher(str);
        if(!matcher.find()){
            System.out.println("111");
        }
        BigInteger ans = new BigInteger(matcher.group(1));
        System.out.println(ans.longValue());
    }
}
