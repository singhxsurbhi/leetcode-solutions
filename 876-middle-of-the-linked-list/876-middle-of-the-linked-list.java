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
    public ListNode middleNode(ListNode head) {
        ListNode[] mid = new ListNode[100];
        int t=0;
        while(head != null){
            mid[t++]=head;
            head=head.next;
        }
        return mid[t/2];
    }
}