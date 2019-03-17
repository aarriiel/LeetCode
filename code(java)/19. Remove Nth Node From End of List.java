/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//runtime beats 100%
//memory usage beats 59.61%
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cal=head;
        int count=0;
        while(cal!=null){
            count++;
            cal=cal.next;
            }
        cal=head;
        if(count-n==0)
            return head.next;
     
        for(int i=0;i<count-n-1;i++)
            cal=cal.next;
        cal.next=cal.next.next;
        return head;
    }
}