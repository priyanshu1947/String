class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i=0;
        int result=0;
        int sign =1;

        while(i<n&&s.charAt(i)==' ')
        i++;
        if(i<n&&s.charAt(i)=='+')
        {
            sign = 1;
            i++;
        }
        else if (i<n&&s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
         while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE/10 && digit > 7))
        {
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
            result = result*10+digit;
            i++;
        }
        return result*sign;
    }
}