class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int num:nums){
            if(hm.containsKey(num)== true){
                return true;
            }
            hm.put(num, true);
        }
        return false;
    }
}
