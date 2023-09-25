import java.util.HashMap;
import java.util.Map;

class Solution {
    public int beautySum(String s) {
        int ans = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> m = new HashMap<>();
            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j); // Get the character at index j in the string

                // Get the current count for the character
                Integer count = m.get(currentChar);

                // If the character is not in the map, set its count to 1; otherwise, increment the count by 1
                if (count == null) {
                    m.put(currentChar, 1);
                } else {
                    m.put(currentChar, count + 1);
                }

                int m_f = 0, l_f = Integer.MAX_VALUE;
                for (Map.Entry<Character, Integer> entry : m.entrySet()) {
                    int value = entry.getValue();
                    m_f = Math.max(m_f, value);
                    l_f = Math.min(l_f, value);
                }
                ans = ans + (m_f - l_f);
            }
        }
        return ans;
    }
}
