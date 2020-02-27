//Runtime: 0 ms, faster than 100.00% of Java online submissions
//Memory Usage: 36.3 MB, less than 100.00% of Java online submissions

class Solution {
    public int numberOfSteps (int num) {
        int step = 0;
        while(num!=0){
            if(num%2==0)
                num=num/2;
            else
                num=num-1;
            step++;
        }
        return step;
    }
}