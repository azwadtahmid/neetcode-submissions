class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> list = new HashMap<>();

    for(String s: strs)
    {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        list.putIfAbsent(sorted, new ArrayList<>());
        list.get(sorted).add(s);
    }

    return new ArrayList<>(list.values());
    }
}
