class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple=k;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        while(hs.contains(multiple)){
            multiple+=k;
        }
        return multiple;
        
    }
}