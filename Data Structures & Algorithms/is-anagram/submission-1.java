class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() ) {
            return false;
        }

        HashMap<Character, Integer> mapping = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (mapping.getOrDefault(c, 0) != 0 ) {
                mapping.put(c, mapping.get(c)+1);
            } else {
                mapping.put(c, 1);
            }
        }

        for (char c: t.toCharArray()) {
            if (mapping.getOrDefault(c, 0) == 0) {
                return false;
            } else {
                mapping.put(c, mapping.get(c)-1);
            }
        }

        return true;
    }
}
