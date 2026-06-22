class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ch[]=new int[128];
        int max=Integer.MIN_VALUE;
        int i=0,j=0;
        while(j<s.length()){
            ch[s.charAt(j)]++;
            while(i<=j && ch[s.charAt(j)]>1){
                ch[s.charAt(i)]--;
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}