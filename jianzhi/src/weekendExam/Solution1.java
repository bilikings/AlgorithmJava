package weekendExam;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package weekendExam
 * @date 2020/9/12 14:48
 */
public class Solution1 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//节点
        int n = scanner.nextInt();//edge
        scanner.nextLine();
        int[][] binary = new int[m + 1][2];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] s = input.split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[2]);
            if ("left".equals(s[1])) {
                binary[x][0] = y;
            } else {
                binary[x][1] = y;
            }
        }
        dfs(binary,1);
        System.out.println(count);
    }

    public static boolean dfs(int[][] binary, int x){
        if(x==0){
            return false;
        }
        //System.out.println(x+" " +binary[x][0]+" "+binary[x][1]);
        if(binary[x][0]==0&&binary[x][1]==0){
            return true;
        }
        boolean f1 = dfs(binary, binary[x][0]);
        boolean f2 = dfs(binary, binary[x][1]);
        if(f1&&f2){
            count++;
        }
        return false;
    }
}