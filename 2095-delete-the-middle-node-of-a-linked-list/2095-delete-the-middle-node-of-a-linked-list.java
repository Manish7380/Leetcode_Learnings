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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null ||head.next == null){
            return null;
        }
        int n =0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        int mid = n/2;
        temp = head;
        while(temp != null){
            mid--;
            if(mid == 0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;

        }
        return head;
    }
}