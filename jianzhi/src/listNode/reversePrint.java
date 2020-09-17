package listNode;

import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package listNode
 * @date 2020/4/30 14:47
 */
public class reversePrint {
    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        int[] res =new int[count];
        for(int i =res.length-1;i>=0;i--){
            res[i]=head.val;
            head= head.next;
        }
        return res;
    }
    //另一种解法可以使用栈的特性
}
