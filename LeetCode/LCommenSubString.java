package LeetCode;

public class LCommenSubString {


    public static int longestCommonSubString(String str1,String str2){

        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        int ans=0;

        // initialization
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }

        // bottom up

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){


                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    System.out.println(dp[i][j]+"  -->i= "+i+"j= "+j);
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        String str1="KBGDE";
        String str2="ABGCE";

        System.out.println(longestCommonSubString(str1,str2));
    }

    /**
     *
     * package LeetCode;
     *
     * public class LCommonSubString {
     *
     *     public static String longestCommonSubString(String str1, String str2) {
     *         int n = str1.length();
     *         int m = str2.length();
     *         int dp[][] = new int[n + 1][m + 1];
     *         int ans = 0;
     *         int endIndex = 0; // To store ending index of the substring in str1
     *
     *         // bottom-up DP
     *         for (int i = 1; i <= n; i++) {
     *             for (int j = 1; j <= m; j++) {
     *                 if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
     *                     dp[i][j] = dp[i - 1][j - 1] + 1;
     *
     *                     if (dp[i][j] > ans) {
     *                         ans = dp[i][j];
     *                         endIndex = i; // store end position of substring
     *                     }
     *                 } else {
     *                     dp[i][j] = 0;
     *                 }
     *             }
     *         }
     *
     *         // extract the substring
     *         String result = str1.substring(endIndex - ans, endIndex);
     *
     *         System.out.println("Length: " + ans);
     *         System.out.println("Substring: " + result);
     *
     *         return result;
     *     }
     *
     *     public static void main(String[] args) {
     *         String str1 = "KBGDE";
     *         String str2 = "ABGCE";
     *
     *         longestCommonSubString(str1, str2);
     *     }
     * }
     */
    /

}
