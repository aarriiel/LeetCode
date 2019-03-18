// 0 ms, faster than 100.00%
// 37.9 MB, less than 19.17%
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans=head;
        while(head!=null&&head.next!=null){
            if(head.next.val==head.val) 
                head.next=head.next.next;
            else
                head=head.next;
        }
        return ans;
    }
}