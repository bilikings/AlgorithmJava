package exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/8/8 15:37
 */
public class Main3 {
    static int res = 0;
    static Set<Integer> st = new HashSet<>();
    static Set<Integer> resSt = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while (T>0){
            T--;
            solution();
        }
    }

    public static void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aGet = 0,bGet=0,pull=0;
        int goodsNums = 0;
        res = 0;
        int[] goods = new int[n];
        for (int i = 0; i < goods.length; i++) {
            int temp =sc.nextInt();
            goods[i]=temp;
            res+=temp;
        }
        dfs(goods,goodsNums,aGet,bGet,pull);
        System.out.println(res);
        System.out.println(resSt);
    }

    public static void dfs(int[] arr,int goodNums,int aget,int bget,int pull){
        if(goodNums>arr.length-1){
            if(aget == bget){
                if(res > pull) {
                    resSt.clear();
                    resSt.addAll(st);
                    res = pull;
                }
            }
            return;
        }
        int t = arr[goodNums];
        dfs(arr,goodNums+1,aget + t,bget,pull);
        dfs(arr,goodNums+1,aget,bget + t,pull);
        Integer temp = goodNums;
        st.add(temp);
        dfs(arr,goodNums+1,aget,bget,pull + t);
        st.remove(temp);
    }
}
