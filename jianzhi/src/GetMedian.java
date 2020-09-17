import java.util.*;
import java.util.stream.Collectors;

/**
 * 用两个堆来求中值
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/5/4 18:34
 */
public class GetMedian<E> {
    private PriorityQueue<E> minP;//最小堆，管理大于中位数m的堆
    private PriorityQueue<E> maxP;//最大堆，管理小于中位数m的堆
    private E m;//临时中值

    public GetMedian() {
        this.minP = new PriorityQueue<>();//小堆顶
        this.maxP = new PriorityQueue<>(11,Collections.reverseOrder());//大堆顶
    }
    private int compare(E e,E m){
        Comparable<? super E> cmpr = (Comparable<? super E>)e;
        return cmpr.compareTo(m);
    }

    public void add(E e){
        if(m==null){
            m =e;
            return;
        }
        if(compare(e,m)<=0){
            //小于中值，加入最大堆
            maxP.add(e);
        }else {
            minP.add(e);
        }
        if(minP.size()-maxP.size()>=2){
            maxP.add(this.m);
            this.m = minP.poll();
        }else if(maxP.size()-minP.size()>=2){
            minP.add(this.m);
            this.m =maxP.poll();
        }
    }
    public void addAll(Collection<? extends E> c){
        for (E e:c) {
            add(e);
        }
    }
    public E getM(){
        return m;
    }
}
class Tmain{
    public static void main(String[] args) {
        GetMedian<Integer> median = new GetMedian<>();
        int[] arr = {34,90,67,45,1,4,5,6,9,10,8};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); ;
        median.addAll(list);
        System.out.println(Collections.binarySearch(list, 2, Collections.reverseOrder()));
        Collections.max(list);
        System.out.println(median.getM());
    }
}