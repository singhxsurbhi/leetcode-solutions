/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
                return null;
            
            int countA = 0;
            ListNode pa = headA;
            while (pa != null){
                pa = pa.next;
                countA++;
            }
            
            int countB = 0;
            ListNode pb = headB;
            while (pb != null){
                pb = pb.next;
                countB++;
            }
            
            pa = headA;
            pb = headB;
            
            if (countA > countB){
                for (int i=0; i<countA-countB; i++){
                    pa = pa.next;
                }    
            } else if (countB > countA){
                for (int i=0; i<countB-countA; i++){
                    pb = pb.next;
                }    
            }
            
            while (pa != pb && pa != null){
                pa = pa.next;
                pb = pb.next;
            }
            
            return pa;
    }
}