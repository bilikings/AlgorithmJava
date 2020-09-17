import java.util.LinkedList;
import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 16:00
 */
public class CQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        while (!stack2.isEmpty()){
            stack2.pop();
        }
        if(stack2.isEmpty()){
            if (stack1.isEmpty()){
                return -1;
            }        while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
