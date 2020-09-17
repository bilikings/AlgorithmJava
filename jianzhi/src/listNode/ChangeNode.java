package listNode;

import java.util.List;

/**
 * @author atom.hu
 * @version V1.0
 * @Package listNode
 * @date 2020/9/2 13:12
 */
public class ChangeNode {
    public ListNode change(ListNode head , int l, int r){
        if(head==null){
            return null;
        }
        ListNode preL = new ListNode(0);
        preL.next = head;
        ListNode curL = head;
        ListNode preR = new ListNode(0);
        preR.next = head;

        for (int i = 1; i <=l; i++) {
            preL =preL.next;
            curL = curL.next;
        }
        ListNode lFlag = preL;
        ListNode rFlag = head;
        for (int i = 1; i <= l; i++) {
            rFlag = rFlag.next;
        }
        ListNode beginNode = curL;
        for (int i = l; i < r; i++) {
            ListNode temp = curL.next;
            curL.next = preL;
            preL = curL;
            curL=temp;
        }
        lFlag.next = curL;
        beginNode.next =rFlag;

        return preR.next;
    }
}
