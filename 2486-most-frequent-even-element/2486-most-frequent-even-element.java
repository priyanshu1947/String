import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int smallestEven = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x % 2 == 0) {
                map.put(x, map.getOrDefault(x, 0) + 1);
                int currentFrequency = map.get(x);
                if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && x < smallestEven)) {
                    maxFrequency = currentFrequency;
                    smallestEven = x;
                }
            }
        }

        return maxFrequency == 0 ? -1 : smallestEven;
    }
}
