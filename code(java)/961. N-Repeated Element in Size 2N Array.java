/*If use the arraylist(3 ms, faster than 100.00%/42.1 MB, less than 5.04%) 
  If use the hashset(4 ms, faster than 94.53%/41.9 MB, less than 6.89%)
  So we can compare that arraylist is faster than hashset when search in the set/list.
  But it use more space than hashset.
  *****************
  
 */
class Solution {
    public int repeatedNTimes(int[] A) {
        //HashSet<Integer> h = new HashSet<Integer>();
        ArrayList<Integer> h = new ArrayList<Integer>();
        int result=0;
        for(int i=0;i<A.length;i++){
            if(h.contains(A[i])){
                result=A[i];
                break;    
            }
            else
                h.add(A[i]);
        }
        return result;
    }
}