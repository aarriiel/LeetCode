class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] key={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> letter=new HashSet<String>();
        for(int i=0;i<words.length;i++){
            String change="";
            for(int j=0;j<words[i].length();j++){
                change+=key[words[i].charAt(j)-97];
            }
            letter.add(change);
        }
        return letter.size();
    }
}