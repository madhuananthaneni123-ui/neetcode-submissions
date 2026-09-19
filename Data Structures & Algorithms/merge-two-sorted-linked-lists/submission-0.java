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
    public ListNode mergeTwoLists(ListNode l, ListNode r) {
        ListNode du=new ListNode(-1);
        ListNode t=du;
        while(l!=null && r!=null){
            if(l.val<=r.val){
                t.next=l;
                l=l.next;
            }
            else{
                t.next=r;
                r=r.next;
            }
            t=t.next;
        }
        if(l!=null) t.next=l;
        else t.next=r;
        return du.next;
    }
}