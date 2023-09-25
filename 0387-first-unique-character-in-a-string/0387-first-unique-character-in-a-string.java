class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        // Count character frequencies and store their first occurrence index
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
