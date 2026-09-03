package Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
       HashMap<Integer, ArrayList<Integer>> adjList;
       Graph(int vertices){
           adjList=new HashMap<>();
           for(int i=0;i<vertices;i++){
               adjList.put(i,new ArrayList<>());
           }
       }

       void AddEdge(int a,int b){
           adjList.get(a).add(b);   //here a is key and b is value.
           adjList.get(b).add(a);
       }

       void print(){
           for(int vertex:adjList.keySet()){
               System.out.print(vertex + "-> ");
               for(int neighbour:adjList.get(vertex)){
                   System.out.print(neighbour + " ");
               }
               System.out.println();
           }
       }
}

class Driver{
    public static void main(String[] args) {
        Graph g=new Graph(3);
        g.AddEdge(0,1);
        g.AddEdge(1,2);
        g.AddEdge(2,0);
        g.print();
    }
}
