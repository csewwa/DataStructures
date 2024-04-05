import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstGraph {
    int vertices;
    LinkedList<Integer> adjustList[];
    BreadthFirstGraph(int count_v){
        vertices = count_v;
        adjustList = new LinkedList[count_v];
        for (int i =0; i< count_v; ++i){
            adjustList[i] = new LinkedList<>();

        }
    }
    void addNewEdge(int v, int w){
        adjustList[v].add(w);

    }
    void graphBFS(int node){
        boolean nowNode[] = new boolean[vertices];
        LinkedList<Integer> vNodeList = new LinkedList<Integer>();
        nowNode[node] = true;
        vNodeList.add(node);
        while (vNodeList.size() != 0){
            node = vNodeList.poll();
            System.out.println(node + "");
            Iterator <Integer> i = adjustList[node].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if(!nowNode[n]){
                    nowNode[n] = true;
                    vNodeList.add(n);
                }
            }
        }
    }
}
class BreadFirstImplement {
    public static void main(String[] args) {
        BreadthFirstGraph b =new BreadthFirstGraph(10);
        b.addNewEdge(2,5);
        b.addNewEdge(3,5);
        b.addNewEdge(1,2);
        b.addNewEdge(2,4);
        b.addNewEdge(4,1);
        b.addNewEdge(6,2);
        b.addNewEdge(5,6);
        b.addNewEdge(1,6);
        b.addNewEdge(6,3);
        b.addNewEdge(3,1);
        b.addNewEdge(7,3);
        b.addNewEdge(3,7);
        b.addNewEdge(7,5);
        System.out.println("Breadth First Graph is : ");
        b.graphBFS(2);

    }
}
