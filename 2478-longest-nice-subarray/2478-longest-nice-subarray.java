class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int condition=0;
        int maxLength=1;
        int right;
        for(right=0;right<nums.length;right++){
            maxLength=Math.max(maxLength,right-left);
            while((nums[right]&condition)!=0){
                condition^=nums[left];
                left++;
            }
            condition^=nums[right];
        }
        maxLength=Math.max(maxLength,right-left);
        return maxLength;
    }
}