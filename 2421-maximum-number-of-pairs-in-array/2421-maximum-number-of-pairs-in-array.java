class Solution {
    public int[] numberOfPairs(int[] nums) 
    {
        int pairs=0, leftover =0;
        int arr [] = new int [101];
        for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        ++arr[num];
    }
        
        for (int i = 0; i < arr.length; i++) 
        {
            
            int num = arr[i];
            pairs += num / 2;
            leftover += num % 2;
        }
        return new int [] {pairs,leftover};
    }
    
}