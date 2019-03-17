/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//6 ms, faster than 83.18% 
// 41 MB, less than 58.92%
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode l3 = new ListNode(0);
       ListNode cal = l3;
       int number = 0;            while(l1!=null||l2!=null){
     if(l1==null){
         number=l2.val;
         l2=l2.next;
     } 
     else if (l2==null){
         number=l1.val;
         l1=l1.next;
     }              
     else if(l1.val<=l2.val){
         number=l1.val;
         l1=l1.next;
     }
     else{
         number=l2.val;
         l2=l2.next;
     }    
        cal.next=new ListNode(number);
        cal=cal.next;
    }
    return l3.next;
    }
}