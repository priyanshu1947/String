class Solution {
    public int[] frequencySort(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      List<Integer> ans= new ArrayList<>();

      for (int i =0;i <nums.length;i++)
      {
          int n = nums[i];
          ans.add(n);
          map.put(n,map.getOrDefault(n,0)+1);
      }  
      Collections.sort(ans,(a,b) -> 
      (map.get(a)==map.get(b))?b-a:map.get(a)-map.get(b));
      int [] result = new int [ans.size()];
      for(int i =0; i<ans.size();i++)
      {
          result[i]= ans.get(i);
      }
      return result;

    }
}