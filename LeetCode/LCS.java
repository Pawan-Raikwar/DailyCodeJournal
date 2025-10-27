package LeetCode;

public class LCS {

    public static String lcs(String str1,String str2,int n,int m){

        if(n==0 || m==0){
            return " ";
        }

        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return lcs(str1,str2,n-1,m-1)+str1.charAt(n-1);
        }
        else{
            String left=lcs(str1,str2,n-1,m);
            String right=lcs(str1,str2,n,m-1);
            return (left.length()>right.length()) ? left:right;
        }

    }


    public static void main(String[] args) {
        String str1="pawan";
        String str2="pawarsiufh";

        System.out.println(lcs(str1,str2, str1.length(),str2.length()));
      //  System.out.println("adfadsfsdfadfa");
    }
}
