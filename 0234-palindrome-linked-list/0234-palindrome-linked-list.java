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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head , fast = head , mid = null ;
        while(fast!=null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode rev = reverse(slow);
        slow.next = null;
        while(rev != null) {
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode p = null , curr = head ;
        while(curr!=null){
            ListNode temp = curr.next ;
            curr.next = p ;
            p = curr ;
            curr = temp ;
        }
        return p ;
    }
}