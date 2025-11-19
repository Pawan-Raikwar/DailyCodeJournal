package Graph;

import java.util.ArrayList;
import java.util.*;

public class BFS {

    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void bfs(ArrayList<Edge>[]graph){
        Queue<Integer> q=new LinkedList<>();

        boolean vis[]=new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];

        bfs(graph);
    }
}
