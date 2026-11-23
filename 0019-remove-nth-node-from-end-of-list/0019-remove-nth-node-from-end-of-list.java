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
        ListNode temp = head;
        int m = 0;
        if(head == null){
            return head.next;
        }
        while(temp != null){
            m++;
            temp = temp.next;
        }
        int ans = m-n;
        if(ans == 0){
            return head.next;
        }
        temp = head;
        int a = 0;
        while(temp != null){
            a++;
            if(a == ans){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}