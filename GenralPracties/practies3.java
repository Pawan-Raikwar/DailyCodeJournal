package GenralPracties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;

import static java.util.Comparator.comparingInt;

import java.util.*;
public class practies3 {

    static class Edge{

    }
    public static void bfs(ArrayList<Edge>[]graph){
        Queue<Integer>q=new LinkedList<>();

        boolean vis[]=new boolean[5];

        q.add(0);

        while(!q.isEmpty()){

            int curr=q.remove();

            if(!vis[curr]){
                System.out.println(curr+" ");

                vis[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    //q.add(e.dest);
                }
            }
        }

    }

    public static void main(String[] args) {

        Queue<String>queue=new LinkedList<>();

        System.out.println("Queue operations");

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherray");
        queue.add("Pawan Raikwar");

        System.out.println(queue);

        queue.offer("Rhiiss");
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Applle"));
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        queue.clear();
        System.out.println(queue    );
    }
}
