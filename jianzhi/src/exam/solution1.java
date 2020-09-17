package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/6 20:00
 */
public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] num1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            num1[i] = val;
        }
        int n2 = sc.nextInt();
        int[] num2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (num1[i] > num2[j]) {
                i++;
            } else if (num1[i] < num2[j]) {
                j++;
            } else {
                break;
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (num1[i] == num2[j]) {
                list.add(num1[i]);
                i++;
                j++;
            } else if (num1[i] > num2[j]) {
                i++;
            } else if (num1[i] < num2[j]) {
                j++;
            }
        }
        for (int num :
                list) {
            System.out.print(num+ " ");
        }
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}