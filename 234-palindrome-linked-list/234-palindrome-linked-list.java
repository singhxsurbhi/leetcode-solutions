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
    public Stack<Integer> fillStack(ListNode head){
        Stack<Integer> stack = new Stack<>();
        
        while(head != null){
            stack.push(head.val);
            head=head.next;
        }
        return stack;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> stack = fillStack(head);
        
        while(head!=null){
            if(head.val != stack.pop()) return false;
            head=head.next;
        }
        return true;
    }
}

