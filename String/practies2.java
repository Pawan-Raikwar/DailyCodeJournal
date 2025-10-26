package String;

public class practies2 {

      public static void FindSubset(String str,int i,String ans){

          if(str.length()==i){
              if(ans.length()==0){
                  System.out.println("String is null");
              }else{
                  System.out.println(ans);
              }
              return;          }

          FindSubset(str,i+1,ans);
          FindSubset(str,i+1,ans+str.charAt(i));
      }

    public static void main(String[] args) {
        String str="Pawan";
        FindSubset(str,0,"");
    }
}
