class Solution {
    public int similarPairs(String[] words) {

       
       
        int n = words.length, count = 0;
        for (int i =0; i<n-1;i++)
        {
             HashSet<Character> set1 = new HashSet<Character>();
            for(char c: words[i].toCharArray())
            {
                set1.add(c);
            }
            for(int j =i+1;j<n;j++)
            {
                HashSet<Character> set2 = new HashSet<Character>();
                for(char c : words[j].toCharArray())
                {
                    set2.add(c);
                }
                if(set1.equals(set2)) count++;
            }
        }
return count;
    }
}