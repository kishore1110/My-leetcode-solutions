class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];}
        for(int i=n-2;i>-1;i--){
            right[i]=right[i+1]+nums[i+1];}
        for(int i=0;i<left.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}