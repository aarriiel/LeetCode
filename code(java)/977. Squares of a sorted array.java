/*use the absolutely function to define, because square is positive.
6 ms, faster than 95.96% of Java online submissions for Squares of a Sorted Array.
43.3 MB, less than 16.80% of Java online submissions for Squares of a Sorted Array.*/

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] B=new int[A.length];
        int first=0;
        int last=A.length-1;
        int index=A.length-1;
        while(first<=last){
            if(Math.abs(A[first])<Math.abs(A[last])){
                B[index]=Math.abs(A[last])*Math.abs(A[last]);
                last--;
            }
            else{
                B[index]=Math.abs(A[first])*Math.abs(A[first]);
                first++;
            }
            index--; 
        }
       
        return B;
    }
}