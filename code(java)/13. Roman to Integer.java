//36 ms, faster than 86.17%
//39 MB, less than 24.61%
//create two arrays to save the roman data
class Solution {
    public int romanToInt(String s) {
        String romanNum = "IVXLCDM";
        int[] num = {1, 5, 10, 50, 100, 500, 1000};
        int preIndex = 0;
        int sum = 0;
        for(int i=s.length()-1;i>=0;i--){
            int index = romanNum.indexOf(s.charAt(i));
            if(preIndex>index)
                sum=sum-num[index];
            else
                sum=sum+num[index];
            preIndex=index;
        }
        return sum;
    }
}