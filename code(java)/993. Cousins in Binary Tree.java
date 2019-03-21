// 3 ms, faster than 100.00% 
//36.9 MB, less than 91.10%
//use the recursive to find the target nodes.(VLR)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //create data class to save parent node and child depth 
    class data{
        TreeNode node;
        int check=-1;
    }
    public void find(TreeNode root, int x,int depth,data d){
        if(root==null)
            return;
        if(root.val==x){
            d.check=depth;
        }       
            
        if(d.check<0){
            d.node=root;
            find(root.left,x,depth+1,d);
        }
        if(d.check<0){
            d.node=root;
            find(root.right,x,depth+1,d);
        }
        
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        data x_d=new data();
        data y_d=new data();
        find(root,x,0,x_d);
        find(root,y,0,y_d);
        return x_d.node!=y_d.node&&x_d.check==y_d.check;
    }
}