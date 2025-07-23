package Graph;

import java.util.*;
public class Graph {
    ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
    Graph(int v){
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int i,int j){
        adjList.get(i).add(j);
        adjList.get(j).add(i);
    }
    public void printList(){
        for(int i=0;i<adjList.size();i++){
            System.out.print("vertex : "+i+"-");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+" ");
            }System.out.println();
        }
    } 
    public void bfs(int v){
        int s=adjList.size();
        boolean seen[]=new boolean[s];
        seen[v]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(v);
        while(!q.isEmpty()){
            int vertex=q.poll();
            System.out.print(vertex+" ");
            for(int i=0;i<adjList.get(vertex).size();i++){
                int av=adjList.get(vertex).get(i);
                if(!seen[av]){
                    seen[av]=true;
                    q.add(av);
                }
            }
        }System.out.println();
    }
    public void dfs(int v){
        int n=adjList.size();
        boolean seen[]=new boolean[n];
        dfsHelper(v,seen);
    }public void dfsHelper(int v,boolean seen[]){
        seen[v]=true;
        System.out.print(v+" ");
        for(int i:adjList.get(v)){
            if(!seen[i])dfsHelper(i, seen);
        }
    }
}
