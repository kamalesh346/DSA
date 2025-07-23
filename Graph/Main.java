package Graph;

public class Main {
    public static void main(String args[]){
        Graph g=new Graph(5);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);
        g.printList();
        g.bfs(0);
        g.dfs(0);
    }
}
