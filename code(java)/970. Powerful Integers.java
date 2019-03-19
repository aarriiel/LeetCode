
//4 ms, faster than 99.72%
//37.3 MB, less than 60.26%
//If I can use the function let the numbers calculate easier, just use it.(LOG!!!)

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> ans=new ArrayList<>();
        int sum=0;
        double left=0,right=0;
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        int i=(int)(Math.log(bound)/Math.log(x));
        int j=(int)(Math.log(bound)/Math.log(y));
        if(x==1)
            i=0;
        if(y==1)
            j=0;
        for(int m=0;m<=i;m++){                
            for(int n=0;n<=j;n++){
                sum=(int)(Math.pow((double)x,m)+Math.pow((double)y,n));
                if(sum<=bound)
                    if(!ans.contains(sum))
                        ans.add(sum);
            }
        }            
        return ans;
    }
}