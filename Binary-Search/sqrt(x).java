class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(x==(long)mid*mid){
                return mid;
            }else if(x>(long)mid*mid){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
        
    }
}

// Here's the easiest sentence to remember.
// Search Insert Position

// Start points to the first place where the target CAN be inserted.

// So

// return start;
// Sqrt(x)

// End points to the largest number whose square is still valid.

// So

// return end;

// ⭐ This is how I remember it.

// Whenever Binary Search ends:

// end < start

// Then ask yourself:

// What does the problem want?

// Wants where to put something? 👉 Return start.
// Wants the last valid answer? 👉 Return end.
