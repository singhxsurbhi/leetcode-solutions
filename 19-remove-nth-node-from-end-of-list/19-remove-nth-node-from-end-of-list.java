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
        ListNode temp=head;
        while(n>0){
            temp = temp.next;
            n--;
        }
        if(temp == null) return head.next;
        
        ListNode temp1 = head;
        
        while(temp.next!= null){
            temp=temp.next;
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        
        return head;
    }
}