class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        boolean isAnagram = true;

        Arrays.sort(s1);
        Arrays.sort(s2);

       if(s1.length != s2.length){
          isAnagram = false;
          return isAnagram;
       } else{
         for(int i=0; i<s1.length; i++){
            if(s1[i] != s2[i]){
                isAnagram = false;
                break;
            }
          }
       }
        return isAnagram;
    }
}
