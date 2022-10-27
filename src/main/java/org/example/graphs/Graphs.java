package org.example.graphs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class GraphStage{
    int src;
    List<Graphs.Node> nodes;

    public  GraphStage(int src) {
        this.src=src;
        this.nodes = new ArrayList<>();
    }

}
class  Edge{
    int dest,src,weight;
    Edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
}
public class Graphs {
    List<GraphStage> graphStages= new ArrayList<>();
    class Node {
        int dest, weight;

        Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "dest : "+dest+" weight : "+weight;
        }
    }

        public int getNodesIndexBySrc(int src ){
            int i=0;
            for (GraphStage graphStage: graphStages) {
                if(graphStage.src==src) return i;
                i++;
            }
           return -1;
        }


    public Graphs(List<Edge> edges){
           for (Edge edge: edges) {
               int index=this.getNodesIndexBySrc(edge.src);
               if(index>-1){
                   graphStages.get(index).nodes.add(new Node(edge.dest, edge.weight));
               }else{
                   GraphStage graphStage = new GraphStage(edge.src);
                   graphStage.nodes.add(new Node(edge.dest, edge.weight));
                   graphStages.add(graphStage);
               }
           }
        }
    public void printGraph(Graphs graph){
           int i=0;
        for (GraphStage graphStage: graphStages) {
            for (Node node:graphStage.nodes) {
                System.out.print( "vertex : "+graphStage.src+"==>"+node.dest+"(" +node.weight+")"+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 2), new Edge(0, 2, 4),
                new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 3),new Edge(4, 5, 1),
                new Edge(5, 4, 3)
        );
        Graphs graph= new Graphs(edges);
        graph.printGraph(graph);





    }

}
