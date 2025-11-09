package Interview;

/*Pascal's Triangle

Given an integer n, print the first n rows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Input: n = 5
Output:

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1  */
public class Practies3 {

    public static void Pascal(int n){
        int arr[][]=new int[n][n];

        arr[0][0]=1;

        for(int i=0;i< arr.length;i++){
            for(int j=1;j<=i;j++){

                if(i==j){
                    arr[i][j]=1;
                    System.out.print(arr[i][j]);
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        Pascal(n);
    }
}
