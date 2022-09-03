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
        if( head.next == null){
            return head.next;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        
        while(fast != null || fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            
            if(fast == null  || fast.next == null) break;
            
        }
        prev.next =slow.next;
        return head;
    }
}