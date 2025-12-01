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
    public ListNode partition(ListNode head, int x) {
        ListNode l = new ListNode(0) ;
        ListNode r = new ListNode(0) ;
        ListNode d = l , b = r ;
        while(head!=null){
            if(head.val<x){
                d.next = head ;
                d = d.next ;
            }
            else{
                b.next = head ;
                b = b.next ;
            }
            head = head.next ;
        }
        d.next = r.next ;
        b.next = null ;
        return l.next ;
    }
}