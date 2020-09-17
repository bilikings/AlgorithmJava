package heap;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package heap
 * @date 2020/8/11 22:40
 */
public class HeapTest {
    static int[] heap;
    int n =0;
    public static void init(int size){
        heap=new int[size];
    }

    public void up(int n){
        while (n>1){
            if(heap[n]>heap[n/2]){
                swap(heap,n,n/2);
                n/=2;
            }else {
                break;
            }
        }
    }

    public void insert(int val){
        heap[++n]=val;
        up(n);
    }

    public void getTop(){
        System.out.println(heap[1]);
    }

    public void down(int p){
        int s = p*2;//左子节点
        while (s<=n){
            if(s<n&&heap[s]<heap[s+1])s++;
            if(heap[s]>heap[p]){
                swap(heap,s,p);
                p=s;
                s=p*2;
            }else {
                break;
            }
        }
    }
    public void extract(){
        int temp = heap[1];
        heap[1] = heap[n--];
        down(1);
        System.out.println(temp);
    }

    public void remove(int p){
        heap[p]=heap[n--];
        up(p);
        down(p);
    }

    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b]= temp;
    }

    public static void main(String[] args) {
        int size =7;
        init(size);
        HeapTest ht= new HeapTest();
        ht.insert(3);
        ht.insert(5);
        ht.insert(2);
        ht.insert(7);
        ht.insert(8);
        ht.insert(2);
        System.out.println(Arrays.toString(heap));
        ht.extract();
        System.out.println(Arrays.toString(heap));
        ht.remove(3);
        System.out.println(Arrays.toString(heap));
    }
}
