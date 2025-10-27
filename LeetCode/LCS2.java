package LeetCode;

public class LCS2 {

    public static String lcs(String str1,String str2,int n,int m){

        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder lcs1=new StringBuilder();

        int i=n,j=m;

        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                 lcs1.append(str1.charAt(i-1));
                 i--;
                 j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        return lcs1.reverse().toString();
    }



    public static void main(String[] args) {
        String str=lcs("pawan","pawan",5,5);
        System.out.println(str);
    }


}
