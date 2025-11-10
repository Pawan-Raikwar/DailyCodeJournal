package Interview;

/*Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Input: nums = [3, 0, 1]
Output: 2  */

public class practies4 {

    public static int missingElement(int nums[]){
        int n_xor=nums.length;

        for(int i=0;i<nums.length;i++){
            n_xor=n_xor^i;
            n_xor=n_xor^nums[i];
        }
        return n_xor;
    }

    public static void main(String[] args) {
        int nums[]={3,0,1};

        System.out.println(missingElement(nums));
    }
}
