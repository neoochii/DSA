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
       public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Find maximum twin sum
        ListNode curr = head;
        int result = 0;

        while (prev != null) {
            result = Math.max(result, curr.val + prev.val);
            curr = curr.next;
            prev = prev.next;
        }

        return result;


    /*
 int res;
    ListNode left;

    public int pairSum(ListNode head) {
        left = head;
        dfs(head);
        return res;
    }

    private void dfs(ListNode right) {
        if (right.next != null)
            dfs(right.next);
        res = Math.max(res, left.val + right.val);
        left = left.next;
    

        

        
        int max =0;
          ListNode current = head;


        ArrayList<Integer> value = new ArrayList<>();
         while (current != null) {
            value.add(current.val); 
            current = current.next;  
        }
        int n = value.size();
        int i = 0;
        int j =n-1;

    while( i < n){

        max = Math.max(max ,  value.get(i) + value.get(n - 1 - i));
        i++;
        j--;
        



        
      }
        return max;*/
    }
}