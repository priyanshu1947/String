import java.util.HashMap;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length)
        {
            return false;
        }
        else
        {
            HashMap<Character,String> word = new HashMap<Character,String>();
            for(int i =0;i<pattern.length();i++)
            {
                char ch= pattern.charAt(i);
                boolean containsKey= word.containsKey(ch);
                 if (word.containsValue(arr[i]) && !containsKey)
                {
                    return false;
                }
                if(containsKey && !word.get(ch).equals(arr[i]))
                {
                    return false;
                }
                else
                {
                    word.put(ch,arr[i]);
                }
                
            }
            return true;
        }
    }
}