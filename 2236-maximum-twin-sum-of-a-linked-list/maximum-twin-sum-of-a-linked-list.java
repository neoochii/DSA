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
        int max =0;
          ListNode current = head;


        ArrayList<Integer> value = new ArrayList<>();
         while (current != null) {
            value.add(current.val); 
            current = current.next;  
        }
        int n = value.size();

      for(int i =0; i< value.size(); i++){

        max = Math.max(max ,  value.get(i) + value.get(n - 1 - i));



        
      }
        return max;
    }
}