package Interview;

/*Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

Return k after placing the final result in the first k slots of nums.

Input: nums = [0,1,1,1,2,2,3]
Output: 4*/
public class Practies1 {

    public  static int MergeSortedArray(int nums[]){

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]<nums[j]){
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
        int nums[]={0,1,1,1,2,2,3};
        System.out.println("THis is the practies and pushhhhhddd");
        System.out.println(MergeSortedArray(nums));
    }
}
