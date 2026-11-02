class Solution {
    public boolean isPalindrome(String s) {
        String trimmed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = trimmed.toCharArray();
        boolean isPalindrome = true;

        for(int i=0; i<chars.length/2; i++){
            int opp = chars.length - 1 - i;

            if(chars[i] != chars[opp]){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
