class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
       int low=0;
       int high=1;
       for(int i=0;i<=nums.length;i++){
        if(nums[i]>0){
            arr.set(low,nums[i]);
            low+=2;
        }
        else{
            arr.set(high,nums[i]);
            high+=2;
        }
       }
       return nums;
    }
}
