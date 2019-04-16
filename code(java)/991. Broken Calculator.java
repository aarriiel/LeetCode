//Runtime: 0 ms, faster than 100.00% of Java online submissions for Broken Calculator.
//Memory Usage: 31.7 MB, less than 100.00% of Java online submissions for Broken Calculator.
//Avoid the number too large, calculate with Y rather than X.
class Solution {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        while(X!=Y){
            if(X>Y)
                return count+X-Y;
            else if(Y%2==0&&((2*X-Y)>=(X-Y/2)||Y/X>1))
                Y/=2;
            else
                Y++;
            count++;
        }
        return count;
    }
}