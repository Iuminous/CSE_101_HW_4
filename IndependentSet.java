import java.util.Comparator;
import java.util.PriorityQueue;


public class IndependentSet {
    public static void main(String[] args) {
        int size = 0;
        int n = Integer.parseInt(args[0]);
        Graph g = new Graph(n);
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new NodeComparator());
        for(int i = 0; i < n; i++) {
            pq.add(g.nodes[i]);
        }
        while(pq.size() > 0) {
            Node curr = pq.poll();
            curr.removeAllNeighbors();
            size++;
        }

   
    }    
}
class NodeComparator implements Comparator<Node> {
    public int compare(Node n1, Node n2) {
        return n2.degree - n1.degree;
    }
}
