import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge {
    int s,d;
    Edge(int s, int d){
        this.s = s;
        this.d = d;

    }
}
class DirectedGraph{
    List<List<Integer>> dgl = new ArrayList<>();
   public DirectedGraph(List<Edge> edges){
        int n = 0;
        for (Edge e : edges ){
            n = Integer.max(n , Integer.max(e.s , e.d));
        }

        for (int i = 0; i<= n ; i++){
            dgl.add(i ,new ArrayList<>());
        }
        for (Edge now : edges){
            dgl.get(now.s).add(now.d);

        }

    }
    public static void showGraph(DirectedGraph dg){
        int s = 0 ;
        int n = dg.dgl.size();
        while (s < n){
            for (int d : dg.dgl.get(s)){
                System.out.println("List of the graph is : ");
                System.out.println("("+s + " ->" +d + ")\t");
            }
            s++;
        }
    }
}
class  DirectedGraphImplement {
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(new Edge(0,1),new Edge(1,2),new Edge(2,4),new Edge(3,2),new Edge(4,1),new Edge(5,4),new Edge(1,1),new Edge(2,5),new Edge(3,4));
        DirectedGraph dg = new DirectedGraph(edges);
        DirectedGraph.showGraph(dg);

    }
}