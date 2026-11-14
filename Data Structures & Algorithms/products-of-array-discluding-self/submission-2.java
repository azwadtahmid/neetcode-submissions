class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1, post =1;
        int[] prods = new int[nums.length];
        int[] prodf = new int[nums.length];
        for(int i = 0; i<nums.length;i++)
        {
            prods[i]=pre;
            pre*=nums[i];
        }
           for(int i = nums.length - 1; i>=0;i--)
        {
           prodf[i]=prods[i]*post;
           post*=nums[i];
        }

        return prodf;
    } 
}