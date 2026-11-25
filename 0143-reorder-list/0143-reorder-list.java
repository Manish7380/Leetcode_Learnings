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
    public void reorderList(ListNode head) {
         if(head == null ||head.next == null){
        return;
    }
    ListNode slow = head;;
    ListNode fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode second = reverse(slow.next);
    slow.next = null;
    ListNode first = head;
    while(second != null){
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;
        first.next = second;
        second.next = temp1;
        first = temp1;
        second = temp2;
    }
    return;
}
public static ListNode reverse(ListNode head){
ListNode prev = null;
ListNode curr = head;
ListNode nxt = null;
while(curr != null){
    nxt = curr.next;
    curr.next = prev;
    prev = curr;
    curr = nxt;
}
return prev;
    }
}