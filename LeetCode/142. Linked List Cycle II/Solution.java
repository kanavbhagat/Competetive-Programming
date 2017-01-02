/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
 public ListNode detectCycle(ListNode head) {
  if (head == null) return null;

  ListNode fast = head;
  ListNode slow = head;


  while (fast != null && fast.next != null) {
   //if any next pointer is null, means end is reached and there is no loop
   fast = fast.next.next;
   slow = slow.next;
   if (slow == fast) {
    ListNode slowSync = head;
    while (slow != slowSync) {
     slow = slow.next;
     slowSync = slowSync.next;
    }
    return slow;
   }
  }
  return null;
 }
}