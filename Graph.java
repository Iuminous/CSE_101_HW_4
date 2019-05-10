import java.util.*;

public class Graph {
    Random rand = new Random();
    public Node nodes[];
    public Graph(int n) {
        nodes = new Node[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        int p;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                p = rand.nextInt(2);
                if(p == 0) {
                    nodes[i].addNeighbor(nodes[j]);
                    nodes[j].addNeighbor(nodes[i]);
                }
            }
        }
    }
}
