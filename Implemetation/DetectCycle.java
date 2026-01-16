package Implemetation;

import java.util.ArrayList;

public class DetectCycle {
    static class Edge{
        int src;
        int dest;

         public Edge(int src,int dest){
             this.src=src;
             this.dest=dest;
         }
    }
    public static void main(String[] args) {

    }
    public static boolean detectCycleUtil(ArrayList<Edge> graph[]){
            boolean vis[]=new boolean[graph.length];

            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    if(detectCycle(graph,vis,i,-1)){
                        return true;
                    }
                }
            }
            return false;
    }
    private static  boolean detectCycle(ArrayList<Edge>graph[],boolean vis[],int curr,int par){
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                 Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    if(detectCycle(graph,vis,e.dest,curr)){
                        return true;
                    }
                }
                else if(vis[e.dest] && e.dest!=par){
                    return true;
                }
            }
     return false;
    }
}

