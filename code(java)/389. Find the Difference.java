//runtime beats 22.49 % of java submissions.
//memory usage beats 7.56 % of java submissions.
class Solution {
    
	public char findTheDifference(String s, String t) {

	        StringBuilder st=new StringBuilder(s);
        
		StringBuilder tt=new StringBuilder(t);
        
		for(int i=0;i<st.length();i++){       
            
			if(tt.indexOf(""+st.charAt(i))!=-1)
                
				tt.deleteCharAt(tt.indexOf(""+st.charAt(i))); 
                }
        
		return tt.charAt(0);
    
	}

}