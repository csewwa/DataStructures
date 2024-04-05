import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph <T> {
    Map<T,
            List<T>> map = new HashMap<>();

    public void addNewVertext(T s) {
        map.put(s, new LinkedList<T>());
    }

    public void addNewEdge(T source, T destination, boolean directional) {
        if (!map.containsKey(source))
            addNewVertext(source);
        if (!map.containsKey(destination))
            addNewVertext(destination);
        map.get(source).add(destination);
        if (directional == true) {
            map.get(destination).add(source);
        }
    }

    public void countVertices() {
        System.out.println("Total Number of Verticles : " + map.keySet().size());
    }

    public void countEdges(boolean direction) {
        int count = 0;
        for (T v : map.keySet()) {
            count = count + map.get(v).size();

        }
        if (direction == true) {
            count = count / 2;
        }
        System.out.println("Total NUmber of Edges :" + count);
    }

    public String countainsVertex(T s) {
        if (map.containsKey(s)) {
            System.out.println("Graph contains " + s + " as a Verticle");
        } else {
            System.out.println("graph does not Contains " + s + "as a Verticle");
        }
        return null;
    }
        public void containsEdge (T s, T d){
            if (map.get(s).contains(d)) {
                System.out.println("Graph has an Edge between" + s + "and " + d + ".");

            } else {
                System.out.println("graph has not an Edge between " + s + "and" + d + ".");

            }
        }
        public String toString () {
            StringBuilder builder = new StringBuilder();
            for (T v : map.keySet()) {
                builder.append(v.toString() + ":");

                for (T w : map.get(v)) {
                    builder.append(w.toString() + "");
                }
                builder.append("\n");
            }
            return (builder.toString());
        }
    }
    class  GraphIpmplement {
        public static void main(String[] args) {
            Graph g = new Graph();
            g.addNewEdge(0,1,true);
            g.addNewEdge(0,4,true);
            g.addNewEdge(1,2,true);
            g.addNewEdge(1,3,true);
            g.addNewEdge(1,4,true);
            g.addNewEdge(2,3,true);
            g.addNewEdge(2,4,true);
            g.addNewEdge(3,0,true);
            g.addNewEdge(2,0,true);
            System.out.println("List of the Graph : \n" +g.toString() );
            g.countVertices();
            g.countEdges(true);
            g.containsEdge (3,4);
            g.containsEdge (2,4);
            g.countainsVertex(5);

        }
    }

