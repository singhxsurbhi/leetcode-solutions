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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        k=k-1;
        while(k>0){
            first=first.next;
            k--;
        }
        ListNode prev=first;
        ListNode second=head;
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        int temp=prev.val;
        prev.val=second.val;
        second.val=temp;
        return head;
    }
}