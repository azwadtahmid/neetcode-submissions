

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> list = new HashMap<>();

        for(int num:nums)
        {
            list.put(num, list.getOrDefault(num, 0)+1);
        }

        ArrayList<int[]> list2 = new ArrayList<>();

        for(Map.Entry<Integer, Integer> count : list.entrySet())
        {
            list2.add(new int[] {count.getValue(), count.getKey()});
        }
        list2.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];

        for(int i =0;i<k;i++)
        {
            res[i] = list2.get(i)[1];
        }

        return res;
    }
}

