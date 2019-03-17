//0 ms, faster than 100.00%
// 36.6 MB, less than 78.73% 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode cal=head;
        int count=0;
        while(cal!=null){
            count++;
            cal=cal.next;
        }
        for(int i=0;i<count/2;i++){
            head=head.next;
        }
        return head;
    }
}