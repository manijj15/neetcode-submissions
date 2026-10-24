class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> grouping = new HashMap<>();

        for (String s : strs) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);

            String sortedS = new String(sArray);
            grouping.putIfAbsent(sortedS, new ArrayList<>());
            grouping.get(sortedS).add(s);
        }

        return new ArrayList<>(grouping.values());
        
    }
}
