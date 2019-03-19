//40.3 MB, less than 97.26%
//5 ms, faster than 45.76%
//using the mergeSortQQ
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeSortNode(ListNode left,ListNode right){
        ListNode ans=new ListNode(0);
        ListNode cal=ans;
        while(left!=null||right!=null){
            if(left==null){
                cal.next=right;
                break;
            }
            else if(right==null){
                cal.next=left;
                break;
            }
            else if(left.val<=right.val){
                cal.next=new ListNode(left.val);
                left=left.next;
            }
            else{
                cal.next=new ListNode(right.val);
                right=right.next;
            }
            cal=cal.next;
        }
        return ans.next;
    }
   
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode fast=head;
        ListNode slow=head;
        ListNode cut=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            if(fast==null||fast.next==null)
                cut=slow;
            slow=slow.next;
            
        }
        cut.next=null;
        return mergeSortNode(sortList(head),sortList(slow));
    }
    
}