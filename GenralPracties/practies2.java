package GenralPracties;

import java.util.HashSet;
import java.util.Iterator;

public class practies2 {

    public static void main(String[] args) {

        HashSet<Integer>hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(4);

        System.out.println(hs);

        Iterator it=  hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            int n = (int) it.next();
            if(n%2==0){
                System.out.println(it.next());
            }
        }


        System.out.println("This is the the for the just push");

    }

    /*

    for(map.Entry<Integer,String>entry : map.entrySet()){
     entry.getKey();
     entry.getValue();

     }

    for(map.Entry<Integer,String>entry:map.entrySet()){
      entry.getKey();
      entry.getValue();


     */




}
