package Interview;

public class Practies2 {


    public static void MergeSortedArray(int nums1[],int nums2[],int n,int m){

        int i=m-1;
        int j=n-1;
        int x=m+n-1;

        while(i>=0 && j>=0){

            if(nums1[i]>nums2[j]){
                nums1[x]=nums1[i];
                x--;
                i--;
            }
            else{
                nums1[x]=nums2[j];
                j--;
                x--;
            }
        }
        while (j>=0){
            nums1[x]=nums2[j];
            j--;
            x--;
        }

    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int n=3;
        int m=3;

        MergeSortedArray(nums1,nums2,n,m);
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}
