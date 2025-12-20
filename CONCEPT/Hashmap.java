package CONCEPT;
import java.util.*;
public class Hashmap {


    public static void main(String[] args) {

        HashMap<Character,ArrayList<Integer>>map=new HashMap<>();

        map.put('a',new ArrayList<>(Arrays.asList(1,2,3)));
        map.get('a').add(555);

        map.put('a',new ArrayList<>());
        map.get('a').add(567);
        System.out.println(map);
        System.out.println("hoasdifha");


    /*    System.out.println(map.get('a').size());
        for(int i=0;i<map.get('a').size();i++){
            System.out.println(map.get('a').get(i));
        }

      /*  ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(map.get('a'));
        System.out.println(list);

      /*  map.put('b',new ArrayList<>(Arrays.asList(1,23)));

        for(Map.Entry<Character,ArrayList<Integer>> hm:map.entrySet()){
            System.out.println(hm.getKey()+" "+ hm.getValue());

        }*/

    }
}
