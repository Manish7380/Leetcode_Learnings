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
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp =head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int rem = k % count;
        if(rem == 0){
            return head;
        }
        temp = head;
        while(temp.next != null){   //find the last node
           temp = temp.next;
        }
        temp.next = head;  // Connect last node to head (make circular)
        int steps = count -rem;
        temp = head;
        for(int i =1; i<steps; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next; // Update the new head
        temp.next = null;   // Break the circular linked list
         return newHead;
    }
}