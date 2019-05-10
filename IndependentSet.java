import java.util.Comparator;
import java.util.PriorityQueue;


public class IndependentSet {
    public static void main(String[] args) {
        for(int z = 0; z < 15; z++) {
            double avg = 0;
            for(int j = 0; j < 5; j++) {

                int size = 0;
                int n = (int)Math.pow(2, z);
                Graph g = new Graph(n);
                PriorityQueue<Node> pq = new PriorityQueue<Node>(new NodeComparator());
                for(int i = 0; i < n; i++) {
                    pq.add(g.nodes[i]);
                }
                while(pq.size() > 0) {
                    Node curr = pq.poll();
                    for(int i = 0; i < curr.list.size(); i++) {
                        pq.remove(curr.list.get(i));
                    }
                    curr.removeAllNeighbors();
                    size++;
                }

                avg += size;
            }
            avg /= 5.0;
            System.out.println(Math.pow(2, z) + ": " + avg);
        }

    }    
}
class NodeComparator implements Comparator<Node> {
    public int compare(Node n1, Node n2) {
        return n2.degree - n1.degree;
    }
}
