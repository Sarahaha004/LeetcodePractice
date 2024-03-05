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
        ListNode first=new ListNode(0);
        first.next=head; 
       
         int l=0;
         ListNode current=head;
         while(current!=null)
         {
             l++;
             current=current.next;
         }
        
           int rem=l-n;
           current=first;
           for(int i=0;i<rem;i++)
           {
               current=current.next;
           }

        current.next=current.next.next;
        return first.next;
        
    }
}