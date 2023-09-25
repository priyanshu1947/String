class Solution {
    public int percentageLetter(String s, char letter) {
        char [] charArray = s.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i =0; i<charArray.length;i++)
        {
           
            map.put(charArray[i],map.getOrDefault(charArray[i],0)+1);

        }
        int frequency =0;
        Set<Character> keySet = map.keySet();
        for (Character c : keySet)
        {
            if(c==letter)
            {
                frequency = map.get(c);
                break;
            }
        }
        int ans = (frequency*100)/s.length();
        return ans;
    }
}