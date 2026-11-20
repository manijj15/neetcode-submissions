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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0 )
            return null;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode list : lists) {
            if (list != null) {
                queue.offer(list);
            }
        }

        ListNode res = new ListNode(0);
        ListNode curr = res;
        while (!queue.isEmpty()) {
            ListNode top = queue.poll();
            curr.next = top;
            curr = top;

            if (top.next != null) {
                queue.offer(top.next);
            }
        }

        return res.next;

    }
}
