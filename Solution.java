/**
 * Find if Cycle in Link List 
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode tort=head;

        ListNode hare=head.next;

        while(hare!=null && hare.next!=null)
        {
            if(tort==hare)
            {
                return true;
            }
            tort=tort.next;
            hare=hare.next.next;
        }
        return false;
    }
}

//Usedd Floyd hare and tortoise algorithm(cycle detection using 2 pointers)
