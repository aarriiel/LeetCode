class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1"; 
        StringBuilder ans = new StringBuilder();
        String test=countAndSay(n-1);
        char temp=test.charAt(0);
        int count=1;
        for(int j=1;j<test.length();j++){
            if(test.charAt(j)-temp!=0){
                ans.append(count);
                ans.append(temp);
                temp=test.charAt(j);
                count=1;
            }
            else
                count++;
        }
        ans.append(count);
        ans.append(temp);
        return ans.toString();
    }
}