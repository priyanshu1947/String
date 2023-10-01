/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int value;
 *     ListNode next;
 *     ListNode(int x) { value = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next=node.next.next;
        temp = null;
    }
}