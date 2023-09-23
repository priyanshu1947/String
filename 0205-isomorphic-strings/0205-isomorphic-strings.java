import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Strings must have the same length to be isomorphic
        }

        HashMap<Character, Character> hashmap = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (hashmap.containsKey(sChar)) {
                if (hashmap.get(sChar) != tChar) {
                    return false; // sChar already mapped to a different character in t
                }
            } else {
                if (hashmap.containsValue(tChar)) {
                    return false; // tChar is already mapped to a different character in s
                }
                hashmap.put(sChar, tChar); // Add the mapping
            }
        }
        
        return true;
    }
}
