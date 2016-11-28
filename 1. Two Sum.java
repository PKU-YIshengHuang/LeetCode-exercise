public class Solution {
    int[] t = {0,0};
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++)
            for(int j=i+1; j<nums.length; j++)
                if (nums[i]+nums[j]==target){
                    t[0]=i;
                    t[1]=j;
                    break;
                }

    return(t);
    }
                       
}