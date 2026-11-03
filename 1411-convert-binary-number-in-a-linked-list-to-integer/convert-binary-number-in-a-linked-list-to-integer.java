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
    public int getDecimalValue(ListNode head) {
      ListNode curr=head;
      ListNode prev=null;
      ListNode next=null;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      ListNode temp=prev;
      int sum=0;
      int i=0;
      while(temp!=null){
        sum+=temp.val*Math.pow(2,i);
        i++;
        temp=temp.next;
      }
      return sum;
    }
}