//2 ms, faster than 99.97%
//37 MB, less than 28.82%
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans=head;
        while(head!=null&&head.next!=null){
            ListNode temp=new ListNode(head.next.val);
            head.next.val=head.val;
            head.val=temp.val;
            head=head.next.next;
        }
        return ans;
    }
}