//1 ms, faster than 100.00%
//35.3 MB, less than 32.94%
//don't use the recursive, it will be slowly.
class Solution {
    public int fib(int N) {
        if(N==0)
            return 0;
         
        int[] array=new int[N+1];
         array[0]=0;
         array[1]=1;
        for(int i=2;i<=N;i++)
            array[i]=array[i-1]+array[i-2];
        return array[N];
    }
}