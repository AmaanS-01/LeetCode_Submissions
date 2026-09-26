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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int a=size-n;
        temp=head;
        ListNode prev=null;
        if(a==0){
            return head.next;
        }
        while(a>0){
            prev=temp;
            temp=temp.next;
            --a;
        }
        prev.next=temp.next;
        return head;
        
    }
}