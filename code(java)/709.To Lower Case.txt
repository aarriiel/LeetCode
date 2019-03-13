class Solution {
    public String toLowerCase(String str) {
        StringBuilder st= new StringBuilder();
        for(char i:str.toCharArray()){
            if(i >= 65 && i <= 90){
                st.append((char)('a'+i-'A'));
            }
            else{
                st.append(i);
            }
        }
        return st.toString();
    }
}