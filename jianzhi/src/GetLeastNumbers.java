import java.util.*;
import java.util.stream.Collectors;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 16:15
 */
public class GetLeastNumbers {
    public static int[] getLeastNumbers(int[] arr, int k) {
//        quickSort(arr, 0, arr.length-1);
//        int[] res = new int[k];
//        for (int i = 0; i < k; i++) {
//            res[i] = arr[i];
//        }
//        return res;
        PriorityQueue queue =new PriorityQueue<>();
        for(int i:arr){
            queue.add(i);
        }
        int[] res = new int[k];
        for (int i = 0; i <res.length ; i++) {
            res[i]= (int) queue.poll();
        }
        return res;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int temp = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && arr[j] >= temp) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= temp) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = temp;
        quickSort(arr, start, i - 1);
        quickSort(arr, j + 1, end);
    }




    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 7, 6};
        System.out.println(Arrays.toString(getLeastNumbers(arr, 5)));
    }
}
