package GenralPracties;

import java.util.ArrayList;

public class HeapIMP {

    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
            // add at last idx

            arr.add(data);

            int x=arr.size();// child index
            int par=(x-1)/2; // par index

            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }

        public  int peek(){
            return arr.get(0);
        }


    }

    public static void main(String[] args) {

    }
}
