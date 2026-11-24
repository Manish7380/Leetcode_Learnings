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
    public ListNode partition(ListNode head, int x) {
        //brute force
        if(head == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(temp.val <x){
                list.add(temp.val);
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.val >= x){
                list.add(temp.val);
            }
            temp = temp.next;
        }
        temp = head;
        int index = 0;
        while(temp != null){
            temp.val = list.get(index++);
            temp = temp.next;
        }
        return head;
    }
}