class Solution {
    public int maxDepth(String s) {
        int result =0, current =0;
        for(int i =0; i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                current++;
                result=Math.max(result, current);
            }
            else if (s.charAt(i)==')')
            {
                current--;
            }
        }
        return result;
        
    }
}