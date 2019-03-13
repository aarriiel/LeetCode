class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*ArrayList<Character> m = new ArrayList<Character>(); 
        int len = (s.length()==1)?1:0;
        int left = 0;
        int right = 0;
        while(right<s.length()){
            if(m.contains(s.charAt(right))){
                if(m.lastIndexOf(s.charAt(right))<left){
                    m.add(s.charAt(right));
                }
                else{
                    if(right-left>len) len = right-left;
                    left = m.lastIndexOf(s.charAt(right))+1;
                    m.add(s.charAt(right));
                }
            }
            else{
                m.add(s.charAt(right));
            }
            right++;
        }
        if(right-left>len) len = right-left;
        return len;*/
        
        
        ArrayList<Character> m = new ArrayList<Character>(); 
        int len = 0;    
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);      
            if(m.contains(temp)){
                if(m.size()>len)
                    len=m.size();
                for(int j=m.indexOf(temp);j>=0;j--){
                    m.remove(j);
                }
                m.add(temp);
            }
            else{
                m.add(temp);
            }
        }
        if(m.size()>len) 
            len=m.size();
        return len;
    }
}