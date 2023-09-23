class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sStr = s.toCharArray();
        char [] tStr = t.toCharArray();

        if(sStr.length==tStr.length)
        {
            Arrays.sort(sStr);
            Arrays.sort(tStr);

            if(Arrays.equals(sStr,tStr))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}