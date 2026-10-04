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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null||head.next==null)return head;
        ListNode tail=head;
        ListNode prev=null;
        int len=0;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0)return head;
        prev.next=head;
        int i=len-k-1;
        temp=head;
        while(i>=0){
            prev=temp;
            temp=temp.next;
            i--;
        }
        prev.next=null;
        return temp;

    }
}