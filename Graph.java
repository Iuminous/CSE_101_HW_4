import java.util.*;

public class Graph {
    Random rand = new Random();
    public Node[n] nodes;
    public Graph(int n) {
        for(int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        int p;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                p = rand.nextInt(2);
                if(p == 0) {
                    node[i].addNeighbor(node[j]);
                    node[j].addNeighbor(node[i]);
                }
            }
        }
    }
}
