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

        // Find middle element
        ListNode fast = head;
        ListNode slow = head;
        while ( fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        
        // re-order second half ( reverse )
        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next = null;
        while ( curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        


        // join first half and second half ( reversed )
        ListNode firstNode = head;
        ListNode secondNode = prev;
        while (secondNode != null) {
            ListNode firstNext = firstNode.next;
            ListNode secondNext = secondNode.next;
            firstNode.next = secondNode;
            secondNode.next = firstNext;
            secondNode = secondNext;
            firstNode = firstNext;
        }
        
    }
}
