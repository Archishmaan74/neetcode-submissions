class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        Set<Integer> uniq = new HashSet<>(); 

        for(int i=0; i<nums.length; i++){
            if(!uniq.add(nums[i])){
                isDuplicate = true;
                break;
            }
        }
      return isDuplicate;
    } 
}