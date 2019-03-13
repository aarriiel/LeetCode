class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> mail=new HashSet<String>();

        for(int i=0;i<emails.length;i++){
            StringBuilder str=new StringBuilder(emails[i]);
            while(str.indexOf(".") != -1&&str.indexOf(".")<str.indexOf("@")){
                str.deleteCharAt(str.indexOf("."));
            }
            if(str.indexOf("+")!=-1){
                str.delete(str.indexOf("+"),str.indexOf("@"));
            }
            mail.add(str.toString());
        }
        return mail.size();
    }
}