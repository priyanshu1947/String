class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i =0; i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                evenList.add(nums[i]);
            }
            else
            {
                oddList.add(nums[i]);
            } 
        }
        evenList.addAll(oddList);

        int [] result = new int [ evenList.size()];
        for (int i =0; i<evenList.size();i++)
        {
            result[i]= evenList.get(i);
        } 
        return result;   
    }
}