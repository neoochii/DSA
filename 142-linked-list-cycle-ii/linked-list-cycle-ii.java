public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle possible with 0 or 1 node
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean cycleDetected = false;

        // Phase 1: Detect cycle and find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleDetected = true;
                break;
            }
        }

        // If no cycle was detected
        if (!cycleDetected) {
            return null;
        }

        // Phase 2: Find the start of the cycle
        // Reset one pointer to the head
        slow = head;
        // Move both pointers one step at a time until they meet
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // The meeting point is the start of the cycle
        return slow;
    }
}