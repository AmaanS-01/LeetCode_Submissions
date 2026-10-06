/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode divide(ListNode head,ListNode tail){
        ListNode result=null;
        if(head==tail)return head;
        else{
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=tail&&fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head1=slow.next;
        slow.next=null;
        ListNode left= divide(head,slow);
        ListNode right= divide(head1,tail);
        result=merge(left,right);
        }
    return result;
    }
    public static ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode p=dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                p.next=left;
                left=left.next;
            }
            else if(left.val>=right.val){
                ListNode temp=right;
                right=right.next;
                p.next=temp;
            }
            p=p.next;
            }
             if(right!=null){
                p.next=right;
             }
             else if(left!=null){
                p.next=left;
             }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head; 
        ListNode temp=head;
        ListNode tail=temp;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
        }
        return divide(head,tail);
    }
}