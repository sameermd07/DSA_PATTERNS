class Solution {
    public String minWindow(String s, String t) {
        String str="";
        if(t.length()>s.length()){
            return "";
        }
        int min=Integer.MAX_VALUE;
        int ch1[]=new int[128];
        int ch2[]=new int[128];
        for(char ch:t.toCharArray()){
            ch1[ch]++;
        }

        int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            ch2[ch]++;
            while(i<=j && isValid(ch1,ch2)){
                if(min>(j-i+1)){
                    str=s.substring(i,j+1);
                    min=j-i+1;
                }
                char c=s.charAt(i);
                ch2[c]--;
                i++;
            }
            j++;
        }
        return str;
    }
    public boolean isValid(int ch1[],int ch2[]){
        for(int i=0;i<128;i++){
            if(ch1[i]>ch2[i]){
                return false;
            }
        }
        return true;
    }
}