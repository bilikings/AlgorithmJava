package exam.mi;

import java.util.HashSet;
import java.util.Scanner;
public class exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length();) {
            char c= s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                res.append(c);
            }
            i++;
        }
        System.out.println(res.toString());
    }
}
