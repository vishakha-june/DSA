class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0; 
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
        
    }
}

// 🧠 One tiny improvement (advanced)

// In interviews, some people prefer writing:

// int mid = start + (end - start) / 2;

// instead of

// int mid = (start + end) / 2;

// Why?

// If start and end are very large integers, then:

// start + end

// can overflow an int.

// Using:

// start + (end - start) / 2

// avoids that overflow while producing the same result.
