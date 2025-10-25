package LeetCode;

public class LeetCodeNo1716 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n){

        if(n==1){
            return n;
        }
        int day=1;
        int rem=7;
        int sum=1;
        int start=0;

        for(int i=2;i<=n;i++){
            day++;
            sum+=day;
            if(day%rem==0){
                rem++;
                start++;
                day=start;
            }
        }
      return sum;
    }
}
