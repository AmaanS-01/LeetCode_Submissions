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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1=slow;
        prev.next=null;
        prev=null;
        ListNode nxt=null;
        ListNode curr=head1;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        ListNode t1=head;
        ListNode t2=prev;
        while(t1!=null&&t2!=null){
            if(t1.val!=t2.val)return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
}