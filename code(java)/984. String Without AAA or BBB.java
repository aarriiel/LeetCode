//4 ms, faster than 93.20% 
//37.3 MB, less than 26.72%
class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder st=new StringBuilder();
        int cal=0;
        while(A>0||B>0){
            if(A>B){
                if(cal>1&&st.charAt(cal-1)=='a'&&st.charAt(cal-2)=='a'){
                    st.append("b");
                    B--;
                }  
                else{
                st.append("a");
                A--;
                }
            }
            else{
                if(cal>1&&st.charAt(cal-1)=='b'&&st.charAt(cal-2)=='b'){
                    st.append("a");
                    A--;
                }  
                else{
                st.append("b");
                B--;
                }
            }
            cal++;
        }   
        return st.toString();    
    }
}

//another way learn from other person
/*
class Solution{
    public boolean isPrev2(StringBuilder st, char c) {
        if (st.length()<2) return false;
        return c==st.charAt(st.length()-1)&&c==st.charAt(st.length() - 2);
    }
    public String strWithout3a3b(int A, int B) {
    StringBuilder st=new StringBuilder();
        while (A!=0||B!=0) {           
            if ((A>B&&!isPrev2(st,'a'))||isPrev2(st,'b')){
                st.append('a');
                A--;
            } else {
                st.append('b');
                B--;
            }
        }
        return st.toString();
    }   
}
*/