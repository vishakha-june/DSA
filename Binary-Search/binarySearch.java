class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid= (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
        
    }
}

// Binary Search Pattern
// ✅ Array must be sorted.
// ✅ start, end, mid are indices.
// ✅ arr[start], arr[end], arr[mid] are values.
// ✅ Compare target with arr[mid], never with mid.
// ✅ Return mid if the question asks for the index.
// ✅ Return -1 if not found.
