/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}*/

class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode control=l3;
        int add=0;
        while(l1!=null||l2!=null||add!=0){
            int number;
            if(l1==null&&l2==null){
                number=0;
            }
            else if(l1==null){
                number=l2.val;
                l2=l2.next;   
            }
            else if(l2==null){
                number=l1.val;
                l1=l1.next;
            }
            else{
                number=l1.val+l2.val;
                l1=l1.next;
                l2=l2.next;
            }
            if(add==1){
                number++;
                add--;
            }
            if(number>9){
                number-=10;
                add++;
            }
            control.next=new ListNode(number);
            control=control.next; 
        }
        return l3.next;
    }
}