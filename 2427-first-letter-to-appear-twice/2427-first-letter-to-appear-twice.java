import java.util.HashMap;
class Solution {
    public char repeatedCharacter(String s) {
        char ch = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                ch= s.charAt(i);
                break;
            }
            map.put(s.charAt(i),i);

        }
        return ch;
    }
}