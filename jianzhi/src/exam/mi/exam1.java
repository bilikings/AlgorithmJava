package exam.mi;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam.mi
 * @date 2020/9/15 19:01
 */
public class exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            strings.add(s);
        }
        scanner.close();
        strings.remove(strings.size() - 1);
        // System.out.println(strings.size());
        for (String s : strings) {
            if ((s.length() & 1) != 0) {
                System.out.println(false);
            } else {
                System.out.println(isCompare(s));
            }
        }
        // System.out.println(isCompare("{[]}"));
    }

    public static boolean isCompare(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek().equals(')')) {
                    stack.pop();
                }
            } else if (c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek().equals('}')) {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek().equals(']')) {
                    stack.pop();
                }
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}