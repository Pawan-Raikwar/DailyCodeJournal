public class Dp3 {

    public static void main(String[] args) {
        int arr[]={4,2,7,1,3};
        int sum=10;

       // System.out.println(targetSum(arr,arr.length,sum));

        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=8;

        System.out.println(unboundedKnapsack(val,wt,W));

    }

    // unbounded knapsack

    public static int unboundedKnapsack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][i]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];

    }


    // 0 or 1 knapsack(taget sum)
    public static boolean targetSum(int arr[],int n, int sum) {

        boolean dp[][]=new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<n+1;i++){

            for(int j=1;j<sum+1;j++){
                int v=arr[i-1];

                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]=true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum];
    }
}
