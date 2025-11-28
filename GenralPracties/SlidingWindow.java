package GenralPracties;

import java.util.*;

public class SlidingWindow {


    public static int Window(int arr[],int k){
        int n=arr.length;
        int i=0;
        int j=k-1;
        int count=0;

        for(int index=0;index<=n-k;index++){

            int sum=arr[i]+arr[j];
            if(sum==arr[i+1]){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }




    public static void main(String[] args) {
        /* int arr[]={2,5,3,4,8,4,12};

        System.out.println(Window(arr,3));
        ArrayList<Integer>list=new ArrayList<>();
        list.add(8);
        list.addFirst(9);
        System.out.println(list);  */

      /*  Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int n=s.length();
        if(n%2==0){
            System.out.println("Not Balanced");
        }else{
            int mid=n/2;
            int ls=0;int rs=0;
            for(int i=0;i<mid;i++){
                ls+=s.charAt(i)-'0';
            }
            for(int j=mid+1;j<n;j++){
                rs+=s.charAt(j)-'0';
            }

            if(ls==rs){
                System.out.println("Balanced");
            }else {
                System.out.println("Not balanced");
            }

        }*/


        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        HashMap<Character,Integer>hm=new LinkedHashMap<>();

        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        boolean found=false;
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                System.out.println("The first non repated character"+entry.getKey());
                found=true;
                return;
            }
        }

       if(found==false){
           System.out.println("There is not repated character");
       }

    }
}
