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
    public ListNode oddEvenList(ListNode head) {
       if(head == null || head.next == null){
        return head;
       }
      ListNode odd = head;
      ListNode even = head.next;
      ListNode evenHead = even; // store the starting node of even
      while(even != null && even.next != null){
        odd.next = even.next; // adding the odd node
        odd = odd.next;
        even.next = odd.next; // adding the. even node
        even = even.next;
      }
      odd.next = evenHead; // connecting the even head;
      return head;

    }
}