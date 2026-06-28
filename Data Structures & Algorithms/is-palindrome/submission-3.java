class Solution {
    public boolean isPalindrome(String s) {
        
        String cleanS = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int j = cleanS.length()-1;

        for(int i =0; i<cleanS.length(); i++){
            if((cleanS.charAt(i)) != cleanS.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
