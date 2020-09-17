/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/22 9:42
 */
public class MinArray {
    public int minArray(int[] numbers) {
        return findMin(numbers, 0, numbers.length - 1);
    }

    public static int findMin(int[] numbers, int left, int right) {
        if (left > right) {
            return numbers[left];
        }
        int mid = (left + right) / 2;
        if (numbers[mid] > numbers[right]) {
            return findMin(numbers, mid + 1, right);
        } else if ((numbers[mid]) < numbers[right]) {
            return findMin(numbers, left, mid);
        } else {
            return findMin(numbers, left, right - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        MinArray minArray = new MinArray();
        System.out.println(minArray.minArray(arr));
    }
}
