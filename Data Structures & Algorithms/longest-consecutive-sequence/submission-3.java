class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> list = new HashSet<>();
      int res = 0;
      for(int num: nums)
      {
        list.add(num);
      }  
      for(int num: nums)
      {
        if(!list.contains(num - 1))
        {
          int streak = 0, curr = num;
          while(list.contains(curr))
          {
              streak++;
              curr++;
          }
          res = Math.max(streak,res);
        }
      }
      return res;
    }
}