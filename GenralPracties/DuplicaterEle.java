package GenralPracties;

import java.util.*;
public class DuplicaterEle {

    public static void main(String[] args) {

        HashSet<Integer>hs=new HashSet<>();
        int arr[]={1,1,3,4,3,4,5};

        for(int element:arr){
            if(!hs.add(element)){
                System.out.println(element);
            }
        }

    }

}
