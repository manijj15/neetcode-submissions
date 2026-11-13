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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        
        if (list2 == null)
            return list1;
        
        ListNode newHead = new ListNode(0);
        ListNode dummy = newHead;
        ListNode one = list1;
        ListNode two = list2;
        while (one != null && two != null) {
            if (one.val < two.val) {
                dummy.next = one;
                one = one.next; 
            } else {
                dummy.next = two;
                two = two.next;
            }
            dummy = dummy.next;
        }

        if (one != null)
            dummy.next = one;
        else
            dummy.next = two;

        return newHead.next;
    }
}