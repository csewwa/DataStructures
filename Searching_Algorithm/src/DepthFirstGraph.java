import java.util.Iterator;
import java.util.LinkedList;

 class DepthFirstGraph {

        int Vertices;
        LinkedList<Integer>adjustList[];

        DepthFirstGraph(int count_v){
            Vertices = count_v;
            adjustList = new LinkedList[count_v];

            for (int i =0; i <count_v; ++i ){
                adjustList[i] = new LinkedList<>();
            }
        }
        public void adNewEdge(int v , int w) {
            adjustList[v].add(w);
        }
        public void graghDFS(int v,boolean vNodeList[]){
            vNodeList[v] = true;
            System.out.println(v + "");
            Iterator<Integer> i = adjustList[v].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!vNodeList[n])
                    graghDFS(n, vNodeList);
            }
        }
        public void dfs(int v){
            boolean now[] = new boolean[Vertices];
            graghDFS(v, now);
        }}
         class DFSImplement{
            public static void main(String[] args) {
                DepthFirstGraph g = new DepthFirstGraph(10);
                g.adNewEdge(1,2);
                g.adNewEdge(2,3);
                g.adNewEdge(3,4);
                g.adNewEdge(4,5);
                g.adNewEdge(5,7);
                g.adNewEdge(5,3);
                g.adNewEdge(1,5);
                g.adNewEdge(5,5);
                g.adNewEdge(2,6);
                g.adNewEdge(3,7);
                System.out.println("Depth First of this Graph is :");
                g.dfs(1);
            }
        }

