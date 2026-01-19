package Implemetation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdjencylistGraph {

    public static void main(String[] args) {
        int v=5;
        int e=10;

        int a[][]=new int[v+1][v+1];

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<=v;i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        // print graph

        for(int i=1;i<=v;i++){
            System.out.print(i+" -> ");
            for(int node:adj.get(i)){
                System.out.println(node+" ");
            }
            System.out.println();
        }



    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj,int source,int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
}
