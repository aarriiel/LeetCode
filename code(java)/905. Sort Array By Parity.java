class Solution {
    public int[] sortArrayByParity(int[] A) {
        int y=A.length-1;
        int x=0;
        while(y>x){
            while(y>x&&A[x]%2==0){
                x++;
            }
            while(y>x&&A[y]%2==1){
                y--;
            }
            if(y>x){
                int temp=A[x];
                A[x]=A[y];
                A[y]=temp;
            }
            x++;y--;
        }
        return A;
    }
}