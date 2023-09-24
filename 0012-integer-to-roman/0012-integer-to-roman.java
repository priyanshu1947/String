class Solution {
    public String intToRoman(int num) {
        int [] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        StringBuilder sb = new StringBuilder();

        int i =values.length-1;;
        while(num>0)
        {
            if(num>=values[i])
            {
                sb.append(roman[i]);
                num-=values[i];
            }
            else
            {
                i--;
            }
        }
        return sb.toString();
}
}