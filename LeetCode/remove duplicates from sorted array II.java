class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3)
            return nums.length;
        int i=2;
        for(int j=i; j<nums.length; j++) {
            if(nums[j]!=nums[i-2]){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
