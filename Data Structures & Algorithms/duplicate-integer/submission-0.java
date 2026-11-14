class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i = 0; i<nums.length;i++)
        {
            if(!x.contains(nums[i]))
            {
                x.add(nums[i]);
            }
            else{
                return true;
            }

        }
        return false;
    }
}