package String;

public class practies1 {

    // find the palidrome string
    public static boolean Palidrome(String str){

        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="pawan";
        System.out.println(Palidrome(str));
    }
}
