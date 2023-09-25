public class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" "); // Split the sentence into words
        int prevNumber = -1; // Initialize a variable to store the previous number
        
        for (int i =0; i<tokens.length;i++) 
        {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0))) { // Check if the token starts with a digit
                int currentNumber = Integer.parseInt(token);
                
                if (currentNumber <= prevNumber) {
                    return false; // Not strictly increasing, return false
                }
                
                prevNumber = currentNumber;
            }
        }
        
        return true; // All numbers are strictly increasing
    }
}
