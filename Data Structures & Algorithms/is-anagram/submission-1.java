class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if(s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        for(int i=0;i<n;i++){
            if(sCharArray[i]!=tCharArray[i]){
                return false;
            }
        }
        return true;
    }
}
