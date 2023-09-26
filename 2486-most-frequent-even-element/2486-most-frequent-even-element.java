import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequentEven = -1;
        int maxFrequency = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                int currentFrequency = frequencyMap.get(num);
                if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && num < mostFrequentEven)) {
                    mostFrequentEven = num;
                    maxFrequency = currentFrequency;
                }
            }
        }

        return mostFrequentEven;
    }
}
