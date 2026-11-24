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
        // Count total nodes
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        // Calculate remaining rotations
        int rem = k % count;
        temp = head;
        while(rem != 0){
            ListNode pre = null;
            temp = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            temp.next = head;
            head = temp;
            pre.next = null;
            rem--;

        }
        return head;
    }
}