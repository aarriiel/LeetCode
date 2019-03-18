//6 ms, faster than 93.49%
// 39.4 MB, less than 52.39%
//using two functions to add lists step by step.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null; 
        return merge(lists,0,lists.length-1);
    }
    //deal with lists by recursive
    public ListNode merge(ListNode[] lists,int left,int right) {
        int mid=left+(right-left)/2;
        if(right-left==1)
            return mergeTwo(lists[left],lists[right]);
        else if(right==left)
            return lists[left];
        else
            return mergeTwo(merge(lists,left, mid), merge(lists, mid+1, right));
            
    }
    //merge each two lists
    public ListNode mergeTwo(ListNode a,ListNode b){
        if(a==null&&b==null)
            return null;
        ListNode sum = new ListNode(0);
        ListNode result = sum;
        while(a!=null||b!=null){
            if(a==null){
                sum.next=new ListNode(b.val);
                b=b.next;
            }
            else if(b==null){
                sum.next=new ListNode(a.val);
                a=a.next;
            }
            else{
                if(a.val<=b.val){
                    sum.next=new ListNode(a.val);
                    a=a.next;
                }
                else{
                    sum.next=new ListNode(b.val);
                    b=b.next;
                }                    
            }
            sum=sum.next;
        }
        return result.next;
    }
}