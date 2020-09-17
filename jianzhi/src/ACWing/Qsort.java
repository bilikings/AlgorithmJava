package ACWing;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package ACWing
 * @date 2020/9/4 9:22
 */
public class Qsort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
        }
        qsort(num);
        for (int res :num) {
            System.out.print(res+" ");
        }
    }

    public static void qsort(int[] arr){
        sort(arr,0,arr.length-1);
    }
    public static void sort(int[] arr,int l,int r){
        if(l>r) return;
        int lp = l;
        int rp = r;
        int temp = arr[l];
        while (l<r){
            while (l<r&&arr[r]>=temp) {
                r--;
            }
            arr[l] =arr[r];
            while (l<r&&arr[l]<=temp) {
                l++;
            }
            arr[r] =arr[l];
        }
        arr[l] =temp;
        sort(arr,lp,l-1);
        sort(arr,r+1,rp);
    }
}
