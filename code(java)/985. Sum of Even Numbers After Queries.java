//7 ms, faster than 93.13% 
//59.1 MB, less than 50.90%
/*First, I used the double for loop, but is very slow because it may run the n*m times. 
So I tryed to just use single loop to solve this question al final. */
class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {        
        int[] ans=new int[A.length];
        int sum=0;
            
        for(int k=0;k<A.length;k++){
            if(A[k]%2==0)
                sum+=A[k];
        }
            
        for(int i=0;i<A.length;i++){
            int pre=A[queries[i][1]];
            pre=(pre%2==0)?pre:0;
            A[queries[i][1]]+=queries[i][0];
            if(A[queries[i][1]]%2==0)
                sum=sum+ A[queries[i][1]]-pre;             
            else
                sum=sum-pre;
            ans[i]=sum;
        }
        return ans;
    }
}