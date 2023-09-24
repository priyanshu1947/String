class Solution {
   
    public String frequencySort(String s) 
    {
        int [] a=new int [128];
        for(char ch : s.toCharArray())
        {
        
        a[ch]++; // convert in ascii value and incremnet the frequency.
        }
        char [] ch = new char[s.length()];
        int i =0;
        for(int k =0;k<s.length();k++)
        {
            int max=0;
            int index=0;

            for(int j =0;j<128;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                    index=j;
                }
            }
            while(a[index]>0)
            {
                ch[i++]=(char)index;
                a[index]--;
            }
        }
        return new String(ch);

        
    }
    
}