package Graphs.AdjacencyMatrix;

public class Graph {
    int v;
    int [][] adjMatrix;
    Graph(int vertices){
        v=vertices;
        adjMatrix=new int[v][v];
    }

    void addEdge(int a,int b ){
        adjMatrix[a][b]=1;  //for a to b
        adjMatrix[b][a]=1;  //for b to a

    }

    void printAdjMat(){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//    void addEdge(int a,int b,int weight,int direction ) {   ///for directed graph
//        adjMatrix[a][b] = weight;
//        if (direction == 1) {
//            adjMatrix[b][a] = weight;
//        }
//    }
//

}
class Driver{
    public static void main(String[] args) {
        Graph g=new Graph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.printAdjMat();
    }
}