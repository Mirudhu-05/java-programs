import java.util.*;
public class BFS{
  static class Graph{
     int V;
     LinkedList<Integer>adjList[];
     Graph(int v){
        V=v;
        adjList=new LinkedList[v];
        for(int i=0;i<v;i++){
           adjList[i]=new LinkedList<>();
        }
      }
      void addEdge(int v,int w){
           adjList[v].add(w);
      }
      void BFS(int start){
           boolean visited[]=new boolean[V];
           LinkedList<Integer>queue=new LinkedList<>();
           visited[start]=true;
           queue.add(start);
           while(!queue.isEmpty()){
                int current=queue.poll();
                System.out.print(current+" ");
                Iterator<Integer>itr=adjList[current].listIterator();
                while(itr.hasNext()){
                    int adj=itr.next();
                    if(!visited[adj]){
                        visited[adj]=true;
                        queue.add(adj);
                    }
                }
           }
      }
  }
  public static void main(String[] args){
      Graph g=new Graph(4);
      g.addEdge(0,1);
      g.addEdge(0,2);
      g.addEdge(1,2);
      g.addEdge(2,0);
      g.addEdge(2,3);
      g.addEdge(3,3);
      System.out.println("Breadth first traversal starting from vertex 2:");
      g.BFS(2);
  }
}