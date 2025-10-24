public class LCS {

    public static void main(String[] args) {

       // String str1="ABCDEEE";
        //String str2="ABCGCDEEE";
        //System.out.println(lcsTab(str1,str2));

       // System.out.println(Longest(str1,str2));
        String s="baaabab";
        String p="*****ba*****ab";
        System.out.println(isMatch(s,p));
    }

    // lcs
    public static int lcsTab(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];

                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
      return dp[n][m];
    }

    // longest commong substirng
    public static int Longest(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        int max=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(dp[i][j],max);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
     return  max;
    }

    // Edit Distance

    public static int editDistance(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];

        // initialize
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int rep=dp[i-1][j-1]+1;

                    dp[i][j]=Math.max(add,Math.max(del,rep));
                }
            }
        }
    return dp[n][m];
    }
    ///Wildcard

    public static boolean isMatch(String s,String p){

        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

        // initialize
        dp[0][0]=true;

        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        //s =" "
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        /// bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                // case -> ith char ==jth char || jth char ==?
                if(s.charAt(i-1)==p.charAt(j-1)|| p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j]=false;
                }
            }
        }
      return dp[n][m];
    }
}
